package wyc.service;

import wyc.pojo.Users;

/**
 * 用户Service
 * @author Yicheng Wang
 */
public interface UsersService {

	/**
	 * 用户登录
	 * @param users
	 * @return
	 */
	Users login(Users users);
	
}
