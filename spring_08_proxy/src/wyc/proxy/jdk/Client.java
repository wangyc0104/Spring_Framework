package wyc.proxy.jdk;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		System.out.println("==========类加载器的类型==========");
		System.out.println(Client.class.getClassLoader());
		System.out.println("客户和老板的类加载器是一样的吗？答：" + ((Client.class.getClassLoader() == Boss.class.getClassLoader()) ? "是" : "不是"));
		Secretary secretary = new Secretary();
		// 第一个参数:反射时使用的类加载器
		// 第二个参数:Proxy需要实现什么接口
		// 第三个参数:通过接口对象调用方法时,需要调用哪个类的invoke方法
		Function function = (Function) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[] { Function.class }, secretary);
		// Boss boss = (Boss) function;
		// boss.eat();
		System.out.println("代理类实际上的类型：" + function.getClass());
		System.out.println("==========代理类开始工作==========");
		function.eat();
	}
}
