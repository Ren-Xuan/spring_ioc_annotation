package com.renxuan.demo1;

import org.springframework.stereotype.Repository;

@Repository("specialuserDao")
public class UserDao {
	public void save() {
		System.out.println("DAO:save user");
	}
}
