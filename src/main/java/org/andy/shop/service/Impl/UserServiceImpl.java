package org.andy.shop.service.Impl;

import org.andy.shop.dao.UserInfoMapper;
import org.andy.shop.model.UserInfo;
import org.andy.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserInfoMapper userInfoMapper;

	public UserInfo getUserById(int id) {
		// TODO Auto-generated method stub
		return userInfoMapper.selectByPrimaryKey(id);
	}

	public int insert(UserInfo userInfo) {
		// TODO Auto-generated method stub
		int result = userInfoMapper.insert(userInfo);
		
		return result;
	}
	
	
}
