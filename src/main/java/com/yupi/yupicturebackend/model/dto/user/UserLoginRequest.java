package com.yupi.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 * @CreateTime: 2025-02-26 00:05
 * @Version: 1.0
 **/
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 2926047212422757352L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;



}
