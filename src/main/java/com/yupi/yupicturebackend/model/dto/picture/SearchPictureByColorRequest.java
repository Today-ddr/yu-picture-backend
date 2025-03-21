 package com.yupi.yupicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

 /**
  * 按颜色搜索图片请求
  *
  * @author Today
  * @date 2025/03/21 04:36:07
  */
 @Data
public class SearchPictureByColorRequest implements Serializable {

    /**
     * 图片主色调
     */
    private String picColor;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}
