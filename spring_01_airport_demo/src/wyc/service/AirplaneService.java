package wyc.service;

import java.util.List;

import wyc.pojo.Airplane;

/**
 * 航班Service
 * @author Yicheng Wang
 */
public interface AirplaneService {
	
	/**
	 * 根据起飞机场和降落机场选择航班
	 * @param takeid
	 * @param landid
	 * @return
	 */
	List<Airplane> show(int takeid, int landid);
	
}
