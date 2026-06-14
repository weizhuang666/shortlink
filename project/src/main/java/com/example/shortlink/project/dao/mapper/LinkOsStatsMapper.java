package com.example.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shortlink.project.dao.entity.LinkOsStatsDO;
import org.apache.ibatis.annotations.Param;

public interface LinkOsStatsMapper extends BaseMapper<LinkOsStatsDO> {

    void shortLinkOsStats(@Param("LinkOsStats") LinkOsStatsDO linkOsStatsDO);

}
