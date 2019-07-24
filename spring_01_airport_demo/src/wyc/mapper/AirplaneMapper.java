package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wyc.pojo.Airplane;

/**
 * 注解方式使用MyBatis
 * @author Yicheng Wang
 */
public interface AirplaneMapper {
	
	List<Airplane> selByTakeidLandid(@Param("takeid") int takeid, @Param("landid") int landid);

}
