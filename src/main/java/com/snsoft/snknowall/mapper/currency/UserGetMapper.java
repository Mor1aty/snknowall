package com.snsoft.snknowall.mapper.currency;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月29日下午10:25:03
 * 
 * @Description TODO 
 *	用户登录接口 Mapper
 */
public interface UserGetMapper {
	// 通过 openId 判断用户存在
	@Select("select count(*) from all_user where open_id=#{openId}")
	public Integer judgeUserExist(String openId);
	
	// 添加用户信息
	@Insert("insert into all_user(open_id,portrait,balance,gmt_create) values(#{openId},1,0,now())")
	public Integer addUser(String openId);
}
