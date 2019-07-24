package wyc.mapper;

import org.apache.ibatis.annotations.Select;

import wyc.pojo.Users;

/**
 * 用户Mapper
 * @author Yicheng Wang
 */
public interface UsersMapper {
	
	/**
	 * 登录功能：根据用户名和密码查找是否存在该用户
	 * @param users
	 * @return
	 */
	@Select("select * from users where username=#{username} and password=#{password}")
	Users selByUsersPwd(Users users);
	
}
