package com.liubo.game.dal;

import com.liubo.game.domain.User;

public interface UserMapper {
	
	User selectUserByUserID(String userID);
}
