package com.liubo.game.das;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liubo.game.dal.UserMapper;
import com.liubo.game.domain.User;

@Repository
public class UserDasImpl implements IUserDas {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUserByUserID(String userID) {
		User user = userMapper.selectUserByUserID(userID);
		return user;
	}

	@Override
	public User selectUserByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

}
