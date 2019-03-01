package com.snsoft.snknowall.bean.user;
/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日下午12:20:25
 * 
 * @Description TODO 
 *	查看个人信息接口 Bean
 */
public class UserInfoGetBean {
	private String username;
	private Integer gender;
	private Integer age;
	private String phone;
	private String realname;
	private String portrait;
	private Integer balance;
	private String gmtCreate;	// gmtCreate = gmt_create
	
	@Override
	public String toString() {
		return "UserInfoGetBean [username=" + username + ", gender=" + gender + ", age=" + age + ", phone=" + phone
				+ ", realname=" + realname + ", portrait=" + portrait + ", balance=" + balance + ", gmtCreate="
				+ gmtCreate + "]";
	}
	
	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
}
