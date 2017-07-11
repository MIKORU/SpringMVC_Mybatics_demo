package org.andy.shop.service;

import org.andy.shop.model.UserInfo;

public interface UserService {
	
	 UserInfo getUserById(int id);
	      
	 int insert(UserInfo userInfo);
}
