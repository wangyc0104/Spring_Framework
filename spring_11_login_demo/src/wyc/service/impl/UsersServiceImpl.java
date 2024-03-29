package wyc.service.impl;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import wyc.mapper.UsersMapper;
import wyc.pojo.Users;
import wyc.service.UsersService;

/**
 * 使用注解的方法实现Service
 * @author Yicheng Wang
 */
@Service
public class UsersServiceImpl implements UsersService {
	
	@Value("${my.demo}")
	private String test;
	
	@Value("${my.demo1}")
	private int test1;
	
	@Resource
	private UsersMapper usersMapper;

	@Override
	public Users login(Users users) {
		System.out.println("输出:" + test + "\n" + test1);
		return usersMapper.selByUsers(users);
	}

}
