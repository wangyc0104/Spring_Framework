package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import wyc.pojo.Airport;

/**
 * 机场Mapper
 * @author Yicheng Wang
 */
public interface AirportMapper {
	
	/**
	 * 选择所有的机场
	 * @return
	 */
	@Select("select * from airport")
	List<Airport> selAll();
	
}
