package wyc.mapper;

import wyc.pojo.Users;

/**
 * 用户数据库访问对象
 * @author Yicheng Wang
 */
public interface UsersMapper {
	
	/**
	 * 根据传入的参数（注入）查询用户
	 * @param users
	 * @return
	 */
	Users selByUsers(Users users);
	
}
