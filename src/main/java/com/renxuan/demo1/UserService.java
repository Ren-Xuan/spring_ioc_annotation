package com.renxuan.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("UserService")
public class UserService {
	@Value("牛奶")
	private String something;
	
	/**
	 * autowired按照属性自动注入
	 **/
	@Autowired
	@Qualifier("specialuserDao")//设置按照名称注入
	//也可以用@Resource(name="specialuserDao")一行代替上面两行
	private UserDao userDao;
	public void say(String name) {
		System.out.println("hello:"+name);
	}
	
	public void drink() {
		System.out.println("drink "+something);
	}
	
	public void save() {
		System.out.println("Service:save user");
		userDao.save();
	}
}
