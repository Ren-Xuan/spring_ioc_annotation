package com.renxuan.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
	@Test
	public void demo1() {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)applicationContext.getBean("UserService");
		userService.say("壬玄");
	}
	@Test
	public void demo2() {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)applicationContext.getBean("UserService");
		userService.drink();;
	}
	
	
	@Test
	public void demo3() {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)applicationContext.getBean("UserService");
		userService.save();
	}
};
