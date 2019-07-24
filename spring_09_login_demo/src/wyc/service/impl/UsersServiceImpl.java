package wyc.service.impl;

import wyc.mapper.UsersMapper;
import wyc.pojo.Users;
import wyc.service.UsersService;

/**
 * 用户Service实现类
 * @author Yicheng Wang
 */
public class UsersServiceImpl implements UsersService {

	private UsersMapper usersMapper;

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	@Override
	public Users login(Users users) {
		return usersMapper.selByUsers(users);
	}

}
