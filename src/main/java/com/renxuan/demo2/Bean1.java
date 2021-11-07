package com.renxuan.demo2;

import org.springframework.stereotype.Component;

@Component("bean1")
public class Bean1 {
	
	//@PostConstruct
	public void init() {
		System.out.println("init Bean");
	}
	
	public void say() {
		System.out.println("say...");
	}
	
//	@PreDestory
	public void destory() {
		System.out.println("destory Bean");
	}
}
