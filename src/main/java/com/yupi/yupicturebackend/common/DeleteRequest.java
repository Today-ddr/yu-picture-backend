package com.yupi.yupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用的删除请求类
 *
 * @CreateTime: 2025-02-24 22:44
 * @Version: 1.0
 **/
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;
    private static final long serialVersionUID = 1L;
}
