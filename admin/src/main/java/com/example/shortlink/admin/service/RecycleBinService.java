package com.example.shortlink.admin.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.shortlink.admin.common.convention.result.Result;
import com.example.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import com.example.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.example.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;


public interface RecycleBinService {

    Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);

}
