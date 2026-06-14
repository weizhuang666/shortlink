package com.example.shortlink.project.service;


import com.example.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import com.example.shortlink.project.dto.resp.ShortLinkStatsRespDTO;

public interface ShortLinkStatsService {

    ShortLinkStatsRespDTO oneShortLinkStats(ShortLinkStatsReqDTO requestParam);

}
