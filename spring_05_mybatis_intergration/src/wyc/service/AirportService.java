package wyc.service;

import java.util.List;

import wyc.pojo.Airport;

/**
 * 机场Service
 * @author Yicheng Wang
 */
public interface AirportService {
	
	/**
	 * 显示所有机场
	 * @return
	 */
	List<Airport> show();
	
}
