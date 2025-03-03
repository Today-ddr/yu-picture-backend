package com.yupi.yupicturebackend.model.vo;

/**
 * @CreateTime: 2025-03-04 00:14
 * @Version: 1.0
 **/

import lombok.Data;

import java.util.List;

/**
 * 图片标签分类列表视图
 */
@Data
public class PictureTagCategory {

    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> categoryList;
}
