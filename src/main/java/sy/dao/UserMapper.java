package sy.dao;

import sy.model.User;

public interface UserMapper {
	User selectByPrimaryKey(String id);

	void insert(User user);
}