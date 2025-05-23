package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.dto.space.SpaceAddRequest;
import com.yupi.yupicturebackend.model.dto.space.SpaceQueryRequest;
import com.yupi.yupicturebackend.model.entity.Space;
import com.yupi.yupicturebackend.model.entity.User;
import com.yupi.yupicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiao
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-03-12 16:04:29
 */
public interface SpaceService extends IService<Space> {


    /**
     * 创建空间
     *
     * @param spaceAddRequest 空间添加请求
     * @param loginUser       登录用户
     * @return long
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 校验空间
     *
     * @param space
     * @param add    是否为创建时检验
     */
    void validSpace(Space space,boolean add);

    /**
     * 获取空间包装类（单条）
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVo(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别，填充空间对象
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);


    /**
     * 校验空间权限
     *
     * @param loginUser 登录用户
     * @param space     空间
     */
    void checkSpaceAuth(User loginUser, Space space);
}
