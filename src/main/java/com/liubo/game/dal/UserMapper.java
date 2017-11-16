package com.liubo.game.dal;

import com.liubo.game.domain.User;

public interface UserMapper {
	
	/**
	 * 通过userID 选择user
	 * @param userID
	 * @return
	 */
	User selectUserByUserID(String userID);
	
	/**
	 * 通过account 选择user
	 * @param account
	 * @return
	 */
	User selectUserByUserAccount(String account);
}
