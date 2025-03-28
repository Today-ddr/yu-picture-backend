package com.yupi.yupicturebackend.model.dto.space.analyze;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用空间分析请求
 *
 * @CreateTime: 2025-03-25 16:00
 * @Version: 1.0
 **/
@Data
public class SpaceAnalyzeRequest implements Serializable {
    private static final long serialVersionUID = 1006753366543373933L;
    /**
     * 空间id
     */
    private Long spaceId;

    /**
     * 是否查询公共图库
     */
    private boolean queryPublic;

    /**
     * 全空间分析
     */
    private boolean queryAll;
}
