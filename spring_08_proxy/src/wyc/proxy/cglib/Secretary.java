package wyc.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 秘书类（代理）
 * 
 * @author Yicheng Wang
 * 
 */
public class Secretary implements MethodInterceptor {

	/**
	 * 使用方法拦截器的代理方式进行代理
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("秘书预约时间");
		// invoke()调用子类重写的方法
		// arg1.invoke(arg0, arg2);
		// arg3.invokeSuper(arg0, arg2);
		Object result = arg3.invokeSuper(arg0, arg2);
		System.out.println("秘书送客户回去");
		return result;
	}

}
