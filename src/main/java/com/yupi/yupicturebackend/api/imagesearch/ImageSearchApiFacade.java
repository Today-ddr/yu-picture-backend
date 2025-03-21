package com.yupi.yupicturebackend.api.imagesearch;

import com.yupi.yupicturebackend.api.imagesearch.model.ImageSearchResult;
import com.yupi.yupicturebackend.api.imagesearch.sub.GetImageFirstUrlApi;
import com.yupi.yupicturebackend.api.imagesearch.sub.GetImageListApi;
import com.yupi.yupicturebackend.api.imagesearch.sub.GetImagePageUrlApi;

import java.util.List;

/**
 * @CreateTime: 2025-03-20 00:45
 * @Version: 1.0
 **/
public class ImageSearchApiFacade {

    /**
     * 搜索图像
     *
     * @param imageUrl 图片网址
     * @return 列表<图片搜索结果>
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;
    }

    public static void main(String[] args) {
        List<ImageSearchResult> imageList = searchImage("https://www.codefather.cn/logo.png");
        System.out.println("结果列表" + imageList);
    }
}
