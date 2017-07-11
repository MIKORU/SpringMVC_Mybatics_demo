package org.andy.shop.test;
import org.andy.shop.model.UserInfo;
import org.andy.shop.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",  
"classpath:spring-mybatis.xml" })  
public class TestUserService {
	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);
	@Autowired
	private UserService userService;
	
	@Test
	public void testQueryById() {
		UserInfo userInfo = userService.getUserById(11);
		System.out.println(JSON.toJSON(userInfo));
		LOGGER.info(JSON.toJSON(userInfo));
	}
	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("mikoru");
		userInfo.setPhone("1354958625");
		int result = userService.insert(userInfo);
		System.out.println("result£º"+result);
	}
	
}
