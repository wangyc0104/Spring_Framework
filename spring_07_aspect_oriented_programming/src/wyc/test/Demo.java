package wyc.test;

public class Demo {

	public void demo(String name, int age) throws Exception {
		// 故意制造一点小惊喜
		// int i = 5 / 0;
		System.out.println("两个参数demo - " + name + "  " + age + "岁");
	}

	public void demo(String name) {
		System.out.println("一个参数demo - " + name);
	}

}
