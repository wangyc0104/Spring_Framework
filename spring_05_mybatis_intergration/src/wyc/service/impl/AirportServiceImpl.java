package wyc.service.impl;

import java.util.List;

import wyc.mapper.AirportMapper;
import wyc.pojo.Airport;
import wyc.service.AirportService;

public class AirportServiceImpl implements AirportService {

	private AirportMapper airportMapper;

	public AirportMapper getAirportMapper() {
		return airportMapper;
	}

	public void setAirportMapper(AirportMapper airportMapper) {
		this.airportMapper = airportMapper;
	}

	@Override
	public List<Airport> show() {
		return airportMapper.selAll();
	}
	
}
