package fenqi.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import fenqi.spring.services.UserService;
import fenqi.spring.services.mapper.UserMapper;
import fenqi.spring.services.model.User;

public class UserServiceTest {
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("file:E:/workspace/springdemo/config/Configuration.xml");
	
//	@Autowired
//	private UserService userService;
	
	@Test
	public void insert() {
		User user = new User();
//		user.setId(1);
		user.setAge("20");
		user.setName("testName");
		
		UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
		userMapper.insert(user);
	}
}
