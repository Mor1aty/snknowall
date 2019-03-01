package com.snsoft.snknowall.controller.currency;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.snknowall.service.currency.UserGetService;
import com.snsoft.snknowall.utils.AllConstant;
import com.snsoft.snknowall.utils.HttpUtil;
import com.snsoft.snknowall.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日上午10:44:34
 * 
 * @Description TODO 用户登录接口 Controller
 */
@RestController
public class UserGetController {
	
	@Autowired
	UserGetService service;
	
	@GetMapping("/user")
	public String login(HttpServletRequest request,HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "openId" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			service.login(params.get("openId"));
			session.setAttribute("loginmark", params.get("openId").toString());
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "登陆成功");
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
