package com.yupi.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新个人资料请求
 */
@Data
public class SetUserDataRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像（原图）
     */
    private String userAvatar;

    /**
     * 用户头像（缩略图）
     */
    private String avatarThumbnail;

    /**
     * 用户简介
     */
    private String userProfile;

    private static final long serialVersionUID = 1L;
}
