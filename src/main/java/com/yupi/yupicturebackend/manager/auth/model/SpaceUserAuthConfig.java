package com.yupi.yupicturebackend.manager.auth.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 空间用户身份验证配置
 *
 * @author Today
 * @date 2025/04/01 04:58:11
 */
@Data
public class SpaceUserAuthConfig implements Serializable {

    /**
     * 权限列表
     */
    private List<SpaceUserPermission> permissions;

    /**
     * 角色列表
     */
    private List<SpaceUserRole> roles;

    private static final long serialVersionUID = 1L;
}
