package com.example.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shortlink.project.dao.biz.ShortLinkStatsRecordDTO;
import com.example.shortlink.project.dao.entity.ShortLinkDO;
import com.example.shortlink.project.dto.req.ShortLinkBatchCreateReqDTO;
import com.example.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.example.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.example.shortlink.project.dto.req.ShortLinkUpdateReqDTO;
import com.example.shortlink.project.dto.resp.ShortLinkBatchCreateRespDTO;
import com.example.shortlink.project.dto.resp.ShortLinkCountQueryRespDTO;
import com.example.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.example.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {

    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);

    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);

    List<ShortLinkCountQueryRespDTO> listGroupShortLinkCount(List<String> requestParam);

    void restoreUrl(String shortUri, HttpServletRequest request, HttpServletResponse response) throws IOException;

    void updateShortLink(ShortLinkUpdateReqDTO requestParam);

    ShortLinkBatchCreateRespDTO batchCreateShortLink(ShortLinkBatchCreateReqDTO requestParam);

    void shortLinkStats(String fullShortUrl, String gid, ShortLinkStatsRecordDTO statsRecord);

}
