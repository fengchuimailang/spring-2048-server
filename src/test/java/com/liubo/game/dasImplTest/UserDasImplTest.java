package com.liubo.game.dasImplTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liubo.game.baseTest.SpringTestCase;
import com.liubo.game.das.IUserDas;
import com.liubo.game.domain.User;

public class UserDasImplTest extends SpringTestCase {

	@Autowired
	private IUserDas userDas;
	
	@Test
	public void selectUserByUserIDTest(){
		User user = userDas.selectUserByUserID("1");
		System.out.println(user.toString());
	}
}
