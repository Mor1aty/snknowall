package com.snsoft.snknowall.mapper.user;

import org.apache.ibatis.annotations.Select;

import com.snsoft.snknowall.bean.user.UserInfoGetBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日下午12:23:36
 * 
 * @Description TODO 查看个人信息接口 Mapper
 */
public interface UserInfoGetMapper {
	@Select("SELECT username,gender,age,phone,realname,all_attach.file_location AS portrait,balance,all_user.gmt_create FROM all_user LEFT JOIN all_attach ON all_user.portrait = all_attach.id WHERE all_user.open_id = #{openId}")
	public UserInfoGetBean getUserInfo(String openId);
}
