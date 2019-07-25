package wyc.mapper;

import wyc.pojo.Users;

/**
 * 用户Mapper
 * @author Yicheng Wang
 */
public interface UsersMapper {
	
	/**
	 * 根据传入参数查询用户
	 * @param users
	 * @return
	 */
	Users selByUsers(Users users);
	
}
