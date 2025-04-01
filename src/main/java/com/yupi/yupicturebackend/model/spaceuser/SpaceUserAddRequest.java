package com.yupi.yupicturebackend.model.spaceuser;

import lombok.Data;

import java.io.Serializable;

/**
 * 空间用户添加请求
 *
 * @author Today
 * @date 2025/04/01 02:29:37
 */
@Data
public class SpaceUserAddRequest implements Serializable {

    /**
     * 空间 ID
     */
    private Long spaceId;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 空间角色：viewer/editor/admin
     */
    private String spaceRole;

    private static final long serialVersionUID = 1L;
}
