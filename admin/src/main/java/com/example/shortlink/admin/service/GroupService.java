package com.example.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shortlink.admin.dao.entity.GroupDO;
import com.example.shortlink.admin.dto.resp.GroupRespDTO;

import java.util.List;

/**
 * 分组接口层
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    /**
     * 查询用户短链接分组集合
     * @return 短链接用户分组集合
     */
    List<GroupRespDTO> listGroup();
}
