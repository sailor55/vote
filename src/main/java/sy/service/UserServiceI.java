package sy.service;

import java.util.List;

import sy.model.User;

public interface UserServiceI {

	public User getUserById(String id);

	public void add(User user);

}
