package fenqi.spring.services.mapper;

import fenqi.spring.services.model.User;

public interface UserMapper {
	int insert(User user);
	
	int update(User user);
	
	User selectByName(String name);
	
	int deleteByPrimarykey(Integer id);
}
