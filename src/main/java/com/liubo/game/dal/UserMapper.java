package com.liubo.game.dal;

import com.liubo.game.domain.User;

public interface UserMapper {
	
	User selectUserByuserID(String userID);
}
