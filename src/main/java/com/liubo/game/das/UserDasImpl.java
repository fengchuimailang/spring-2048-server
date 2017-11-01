package com.liubo.game.das;

import org.springframework.beans.factory.annotation.Autowired;

import com.liubo.game.dal.UserMapper;
import com.liubo.game.domain.User;

public class UserDasImpl implements IUserDas {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUserByUserID(String userID) {
		User user = userMapper.selectUserByuserID(userID);
		return user;
	}

}
