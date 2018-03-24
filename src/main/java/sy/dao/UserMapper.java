package sy.dao;

import java.util.List;

import sy.model.User;

public interface UserMapper {
	User selectByPrimaryKey(String id);

	void insert(User user);
}