package fenqi.spring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fenqi.spring.services.UserService;
import fenqi.spring.services.mapper.UserMapper;
import fenqi.spring.services.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void insert(User user) {
		userMapper.insert(user);
		System.out.println("UserServiceImpl 被访问！！！");
	}
}
