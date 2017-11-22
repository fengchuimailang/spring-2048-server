package com.liubo.game.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liubo.game.das.IUserDas;
import com.liubo.game.domain.QueryReturnTemplet;
import com.liubo.game.domain.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	private final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private IUserDas userDas;

	@RequestMapping(method = RequestMethod.GET)
	public String loginGet(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("userInfo") != null) {
			return "redirect:/";
		} else {
			return "login";
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public QueryReturnTemplet<Object> loginPost(Model model, @RequestBody User user, HttpServletRequest request,
			HttpServletResponse response) {
		logger.debug("login start...");
		logger.debug("login account:" + user.getAccount());
		logger.debug("login password:" + user.getPassword());
		QueryReturnTemplet<Object> qrt = new QueryReturnTemplet<Object>();
		if (user.getAccount() == null || "".equals(user.getAccount().trim())) {
			qrt.setIsSuccess("false");
			qrt.setRetMessage("用户名不能为空");
			return qrt;
		}
		if (user.getPassword() == null || "".equals(user.getPassword())) {
			qrt.setIsSuccess("false");
			qrt.setRetMessage("密码不能为空");
			return qrt;
		}
		// 这样写就不允许有重复的account
		User userInDb = userDas.selectUserByAccount(user.getAccount());
		if (userInDb != null) {
			if (user.getPassword().trim().equals(userInDb.getPassword())) {
				request.getSession().setAttribute("userInfo", userInDb);
				qrt.setIsSuccess("true");
			}else{
				qrt.setIsSuccess("false");
				qrt.setRetMessage("密码不正确");
			}
		}else{
			qrt.setIsSuccess("false");
			qrt.setRetMessage("用户名错误");
		}
		// 返回模版
		return qrt;
	}

	@RequestMapping(value = "/logOut", method = RequestMethod.POST)
	@ResponseBody
	public String logOut(HttpServletRequest request) {
		logger.debug("log out ...");
		String retMsg = "";
		try {
			request.getSession().removeAttribute("userInfo");
			retMsg = "1";
		} catch (Exception e) {
			logger.error("log out error:", e);
			retMsg = "0";
		}
		return retMsg;
	}

}
