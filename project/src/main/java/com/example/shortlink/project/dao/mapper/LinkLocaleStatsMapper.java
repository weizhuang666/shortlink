package com.example.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shortlink.project.dao.entity.LinkLocaleStatsDO;
import org.apache.ibatis.annotations.Param;

/**
 * 地区统计访问持久层
 */
public interface LinkLocaleStatsMapper extends BaseMapper<LinkLocaleStatsDO> {

    /**
     * 记录地区监控访问数据
     */
    void shortLinkLocaleStats(@Param("LinkLocaleStats") LinkLocaleStatsDO linkLocaleStatsDO);

}
