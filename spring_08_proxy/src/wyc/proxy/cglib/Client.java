package wyc.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
	public static void main(String[] args) {
		// 增幅器
		Enhancer enhancer = new Enhancer();
		// 增幅器设定要代理的目标
		enhancer.setSuperclass(Boss.class);
		// 增幅器在其内部将Boss类与代理对象进行联系，注册回调方法
		enhancer.setCallback(new Secretary());
		// 增幅器生成处理后的Boss对象
		Boss boss = (Boss) enhancer.create();
		// 现在Boss对象进行方法调用后会实现代理方法了
		boss.eat();
	}
}
