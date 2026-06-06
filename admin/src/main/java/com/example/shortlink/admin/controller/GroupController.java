package com.example.shortlink.admin.controller;

import com.example.shortlink.admin.common.convention.result.Result;
import com.example.shortlink.admin.common.convention.result.Results;
import com.example.shortlink.admin.dto.req.GroupSaveReqDTO;
import com.example.shortlink.admin.dto.resp.GroupRespDTO;
import com.example.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 分组管理控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping("/api/short-link/v1/group")
    public Result<Void> saveGroup(@RequestBody GroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }

    /**
     * 获取分组
     * @return
     */
    @GetMapping("/api/short-link/v1/group")
    public Result<List<GroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }
}
