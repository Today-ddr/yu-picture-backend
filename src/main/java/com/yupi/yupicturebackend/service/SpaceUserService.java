package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.entity.SpaceUser;
import com.yupi.yupicturebackend.model.entity.User;
import com.yupi.yupicturebackend.model.spaceuser.SpaceUserAddRequest;
import com.yupi.yupicturebackend.model.spaceuser.SpaceUserQueryRequest;
import com.yupi.yupicturebackend.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author xiao
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-04-01 14:16:24
*/
public interface SpaceUserService extends IService<SpaceUser> {


    /**
     * 创建空间成员
     *
     * @param spaceUserAddRequest 空间添加请求
     * @return long
     */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    /**
     * 校验空间成员
     *
     * @param spaceUser
     * @param add    是否为创建时检验
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);

    /**
     * 获取空间成员包装类（单条）
     *
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVo(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 获取空间成员包装类（分页）
     *
     * @param spaceUserList
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);

    /**
     * 获取查询对象
     *
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

}
