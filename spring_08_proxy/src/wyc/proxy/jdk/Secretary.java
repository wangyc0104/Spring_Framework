package wyc.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 秘书帮助老板实现职责
 * @author Yicheng Wang
 */
public class Secretary implements InvocationHandler {
	private Boss boss = new Boss();

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("秘书帮老板预约时间");
		Object result = method.invoke(boss, args);
		System.out.println("秘书记录访客信息");
		return result;
	}

}
