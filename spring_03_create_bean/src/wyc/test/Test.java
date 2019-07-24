package wyc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wyc.pojo.People;
import wyc.pojo.PeopleInstantFactory;
import wyc.pojo.PeopleStaticFactory;

/**
 * 使用各种方法来实例化People类
 * @author Yicheng Wang
 */
public class Test {
	public static void main(String[] args) {

		// 直接实例化
		People people0 = new People();

		// 使用ApplicationContext带构造参数的依赖注入实例化
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people1 = ac.getBean("people1", People.class);

		// 使用ApplicationContext实例工厂的依赖注入实例化
		People people2 = ac.getBean("people2", People.class);

		// 使用ApplicationContext静态工厂的依赖注入实例化
		People people3 = ac.getBean("people3", People.class);

		// 实例工厂实例化
		PeopleInstantFactory factory = new PeopleInstantFactory();
		People people4 = factory.newInstance();

		// 静态工厂实例化
		People people5 = PeopleStaticFactory.newInstance();

		System.out.println("people0" + people0);
		System.out.println("people1" + people1);
		System.out.println("people2" + people2);
		System.out.println("people3" + people3);
		System.out.println("people4" + people4);
		System.out.println("people5" + people5);
		
		// String[] names = ac.getBeanDefinitionNames();
		// for (String string : names) {
		// System.out.println(string);
		// }
	}
	
}
