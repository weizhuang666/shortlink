package com.example.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shortlink.project.dao.entity.ShortLinkDO;
import com.example.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.example.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {

    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);
}
