package com.liubo.game.das;

import com.liubo.game.domain.User;

public interface IUserDas {
	
	/**
	 * 
	 * @param userID
	 * @return
	 */
	public User selectUserByUserID(String userID);
	
	/**
	 * 
	 * @param account
	 * @return
	 */
	public User selectUserByAccount(String account);
	
}
