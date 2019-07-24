package wyc.service.impl;

import wyc.mapper.UsersMapper;
import wyc.pojo.Users;
import wyc.service.UsersService;

public class UsersServiceImpl implements UsersService {
	
	private UsersMapper usersMapper;

	@Override
	public Users login(Users users) {
		return usersMapper.selByUsersPwd(users);
	}

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

}
