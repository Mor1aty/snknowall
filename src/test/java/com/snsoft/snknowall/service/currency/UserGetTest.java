package com.snsoft.snknowall.service.currency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月29日下午11:00:51
 * 
 * @Description TODO 
 *	用户登录接口 Service 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserGetTest {
	
	@Autowired(required = false)
	UserGetService service;
	
	@Test
	public void ServiceTest() throws Exception {
		service.login("asdfg");
	}
}
