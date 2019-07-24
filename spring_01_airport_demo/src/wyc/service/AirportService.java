package wyc.service;

import java.util.List;

import wyc.pojo.Airport;

/**
 * 机场Service
 * @author Yicheng Wang
 */
public interface AirportService {
	
	/**
	 * 显示所有起飞机场
	 * @return
	 */
	List<Airport> showTakePort();
	
	/**
	 * 显示所有降落机场
	 * @return
	 */
	List<Airport> showLandPort();
	
}
