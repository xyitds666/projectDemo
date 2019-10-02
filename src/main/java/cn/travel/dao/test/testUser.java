package cn.travel.dao.test;

import org.junit.Test;

import cn.travel.dao.UserDao;
import cn.travel.dao.impl.UserDaoImpl;
import cn.travel.domain.User;

public class testUser {
	
	UserDao userDao=new UserDaoImpl();
	
	@Test
	public void testFindUser(){
		User user=userDao.findByUsername("admin123");
		System.out.println(user);
	}
	
	@Test
	public void testUserRegister(){
		User user=new User();
		user.setUsername("tom12345");
		user.setPassword("tom12345");
		user.setEmail("tomcat2010@163.com");
		userDao.save(user);
	}
}
