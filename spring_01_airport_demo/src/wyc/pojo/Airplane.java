package wyc.pojo;

/**
 * 飞机类
 * @author Yicheng Wang
 */
public class Airplane {
	
	private int id;
	private String airNo;
	private int time;
	private double price;
	private Airport takePort;
	private Airport landPort;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirNo() {
		return airNo;
	}

	public void setAirNo(String airNo) {
		this.airNo = airNo;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Airport getTakePort() {
		return takePort;
	}

	public void setTakePort(Airport takePort) {
		this.takePort = takePort;
	}

	public Airport getLandPort() {
		return landPort;
	}

	public void setLandPort(Airport landPort) {
		this.landPort = landPort;
	}
	
}
