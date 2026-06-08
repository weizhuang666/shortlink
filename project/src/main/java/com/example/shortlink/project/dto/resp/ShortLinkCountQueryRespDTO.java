package com.example.shortlink.project.dto.resp;

import lombok.Data;

/**
 * 分组查询返回
 */
@Data
public class ShortLinkCountQueryRespDTO {

    private String gid;

    private Integer shortLinkCount;

}
