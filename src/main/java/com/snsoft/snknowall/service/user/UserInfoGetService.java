package com.snsoft.snknowall.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.snknowall.bean.user.UserInfoGetBean;
import com.snsoft.snknowall.mapper.user.UserInfoGetMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日下午12:39:25
 * 
 * @Description TODO 
 *	查看个人信息接口 Service
 */
@Service
public class UserInfoGetService {
	@Autowired(required = false)
	UserInfoGetMapper mapper;
	
	public UserInfoGetBean getUserInfo(String openId) {
		return mapper.getUserInfo(openId);
	}
}

