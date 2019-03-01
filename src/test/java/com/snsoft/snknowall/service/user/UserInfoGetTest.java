package com.snsoft.snknowall.service.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.snsoft.snknowall.mapper.user.UserInfoGetMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日下午12:42:22
 * 
 * @Description TODO 
 *	查看个人信息接口 Service 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoGetTest {
	@Autowired(required = false)
	UserInfoGetMapper mapper;
	
	@Test
	public void ServiceTest() throws Exception {
		System.out.println(mapper.getUserInfo("321"));
	}
}
