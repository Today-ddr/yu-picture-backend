package com.yupi.yupicturebackend.controller;

import com.yupi.yupicturebackend.common.BaseResponse;
import com.yupi.yupicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 *
 * @CreateTime: 2025-02-24 22:54
 * @Version: 1.0
 **/

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     * @return ok
     */
    @GetMapping("/health")
    public BaseResponse<String>health(){
        return ResultUtils.success("ok");
    }
}
