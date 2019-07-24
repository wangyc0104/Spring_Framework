package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import wyc.pojo.Airport;

/**
 * 注解方式使用MyBatis
 * @author Yicheng Wang
 */
public interface AirportMapper {
	
	@Select("select * from airport where id in (select distinct takeid from airplane)")
	List<Airport> selTakePort();

	@Select("select * from airport where id in (select distinct landid from airplane)")
	List<Airport> selLandPort();
	
}
