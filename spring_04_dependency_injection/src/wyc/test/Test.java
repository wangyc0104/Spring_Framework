package wyc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wyc.pojo.People;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("people",People.class);
		System.out.println(people.getList().size());
		System.out.println(people);
	}
}
