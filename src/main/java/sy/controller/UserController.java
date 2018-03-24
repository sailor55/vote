package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sy.model.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/{id}/showUser", method = RequestMethod.GET)
	public String showUserById(@PathVariable String id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}

	//注册
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user, HttpServletRequest request) {
		System.out.println("register");
		userService.add(user);
		request.setAttribute("user", user);
		return "showUser";
		//return "redirect:/usercontroller/1/showUser.json";
	}
	@RequestMapping(value ="toregister", method = RequestMethod.GET)
	public String toRegister(HttpServletRequest request) {
		System.out.println("toRegister");
		return "register";
	}

	//登录 用户系统部分内容暂时不做 直接先做投票功能 有时间慢慢加
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute User user, HttpServletRequest request) {
		System.out.println("login");
		userService.add(user);
		request.setAttribute("user", user);
		return "showUser";
	}


}
