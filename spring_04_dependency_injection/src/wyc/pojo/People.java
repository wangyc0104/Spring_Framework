package wyc.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.convert.Property;

/**
 * 人类
 * @author Yicheng Wang
 */
public class People {

	private int id;
	private String name;
	private Set<String> sets;
	private List<String> list;
	private String[] strs;
	private Map<String, String> map;
	private Properties properties;
	private Desk desk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String[] getStrs() {
		return strs;
	}

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sets=" + sets + ", list=" + list + ", strs=" + Arrays.toString(strs) + ", map=" + map + ", properties=" + properties + ", desk=" + desk + "]";
	}

}
