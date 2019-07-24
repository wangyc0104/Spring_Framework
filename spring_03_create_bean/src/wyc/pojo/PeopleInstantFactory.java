package wyc.pojo;

/**
 * 实例化工厂方法创建People对象
 * @author Yicheng Wang
 */
public class PeopleInstantFactory {

	public People newInstance() {
		return new People((int) (Math.random() * 100), "实例化工厂创建的People");
	}

}
