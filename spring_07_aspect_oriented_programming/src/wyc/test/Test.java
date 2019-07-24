package wyc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo = ac.getBean("demo", Demo.class);
		try {
			System.out.println("==========demo.demo(\"张三\", 12)==========");
			demo.demo("张三", 12);
			System.out.println("==========demo.demo(\"李四\");==========");
			demo.demo("李四");
		} catch (Exception e) { }
	}

}
