package wyc.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import wyc.mapper.AirportMapper;
import wyc.pojo.Airport;
import wyc.service.AirportService;
import wyc.util.MyBatisUtil;

public class AirportServiceImpl implements AirportService {

	@Override
	public List<Airport> showTakePort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selTakePort();
	}

	@Override
	public List<Airport> showLandPort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selLandPort();
	}

}
