package com.example.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shortlink.project.dao.entity.LinkAccessStatsDO;
import org.apache.ibatis.annotations.Param;

public interface LinkAccessStatsMapper extends BaseMapper<LinkAccessStatsDO> {

    void shortLinkStats(@Param("LinkAccessStats") LinkAccessStatsDO linkAccessStatsDO);

}
