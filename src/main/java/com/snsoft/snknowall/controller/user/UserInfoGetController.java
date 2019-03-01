package com.snsoft.snknowall.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.snknowall.bean.user.UserInfoGetBean;
import com.snsoft.snknowall.service.user.UserInfoGetService;
import com.snsoft.snknowall.utils.AllConstant;
import com.snsoft.snknowall.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日下午2:28:30
 * 
 * @Description TODO 查看个人信息接口 Controller
 */
@RestController
public class UserInfoGetController {
	
	@Autowired
	UserInfoGetService service;
	
	@GetMapping("/userInfo")
	public String getUserInfo(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			UserInfoGetBean bean = service.getUserInfo(session.getAttribute("loginmark").toString());
			if(bean == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "未找到用户信息");
			}else {
				result = JsonUtil.jsonResponse(bean, AllConstant.CODE_SUCCESS, "查询成功");
			}
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
