package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sy.model.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/usercontroller")
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
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@RequestBody User user, HttpServletRequest request) {
		System.out.println("register");
		userService.add(user);
		request.setAttribute("user", user);
		return "showUser";
	}
	@RequestMapping(value ="toregister", method = RequestMethod.GET)
	public String toRegister(HttpServletRequest request) {
		System.out.println("toRegister");
		return "register";
	}


}
