package wyc.pojo;

/**
 * 静态工厂方法创建People对象
 * @author Yicheng Wang
 */
public class PeopleStaticFactory {

	public static People newInstance() {
		return new People((int) (Math.random() * 100), "静态工厂创建的People");
	}

}
