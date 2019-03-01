package com.snsoft.snknowall.service.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.snknowall.mapper.currency.UserGetMapper;


/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月29日下午10:42:42
 * 
 * @Description TODO 用户登录接口 Service
 */
@Service
public class UserGetService {
	@Autowired(required = false)
	UserGetMapper mapper;

	public void login(String openId) throws Exception {
		int is = mapper.judgeUserExist(openId);
		if(is == 0) {
			mapper.addUser(openId);
		}
	}
}
