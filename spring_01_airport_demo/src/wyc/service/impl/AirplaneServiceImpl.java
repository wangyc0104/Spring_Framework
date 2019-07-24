package wyc.service.impl;

import java.util.List;

import wyc.mapper.AirplaneMapper;
import wyc.pojo.Airplane;
import wyc.service.AirplaneService;
import wyc.util.MyBatisUtil;

public class AirplaneServiceImpl implements AirplaneService {

	@Override
	public List<Airplane> show(int takeid, int landid) {
		return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid, landid);
	}

}
