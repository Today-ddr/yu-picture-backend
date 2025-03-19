package com.yupi.yupicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 空间级别
 * @CreateTime: 2025-03-16 17:18
 * @Version: 1.0
 **/

@Data
@AllArgsConstructor
public class SpaceLevel {


    /**
     * 值
     */
    private int value;

    /**
     * 中文
     */
    private String text;

    /**
     * 最大数量
     */
    private long maxCount;

    /**
     * 最大容量
     */
    private long maxSize;
}
