package com.example.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shortlink.admin.dao.entity.GroupDO;
import com.example.shortlink.admin.dao.mapper.GroupMapper;
import com.example.shortlink.admin.dto.resp.GroupRespDTO;
import com.example.shortlink.admin.service.GroupService;
import com.example.shortlink.admin.toolkit.RandomGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分组接口实现层
 */
@Service
@RequiredArgsConstructor
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {

    @Override
    public void saveGroup(String groupName) {
        // TODO 判断用户下是否有相同的groupName
        String gid;
        do {
            gid = RandomGenerator.generateRandom();
        } while (hasGid(gid));
        GroupDO groupDO = GroupDO.builder()
                .gid(gid)
                .name(groupName)
                .sortOrder(0)
                .build();
        baseMapper.insert(groupDO);
    }

    @Override
    public List<GroupRespDTO> listGroup() {
        // TODO 获取用户名
        Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getDelFlag, 0)
                .isNull(GroupDO::getUsername)
                .orderByDesc(GroupDO::getSortOrder, GroupDO::getUpdateTime);
        return null;
    }

    private Boolean hasGid(String gid) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                // TODO 设置用户名
                .eq(GroupDO::getUsername, null);
        return baseMapper.selectOne(queryWrapper) != null;
    }
}
