package com.yupi.yupicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 按批量请求编辑图片
 *
 * @author Today
 * @date 2025/03/22 03:39:28
 */
@Data
public class PictureEditByBatchRequest implements Serializable {

    /**
     * 图片 id 列表
     */
    private List<Long> pictureIdList;

    /**
     * 空间 id
     */
    private Long spaceId;

    /**
     * 分类
     */
    private String category;

    /**
     * 标签
     */
    private List<String> tags;


    /**
     * 命名规则
     */
    private String nameRule;

    private static final long serialVersionUID = 1L;
}
