package wyc.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切点的前置、环绕、后置方法 <br>
 * @author Yicheng Wang
 */
public class MyAdvice {
	
	public void mybefore(String name, int age) {
		System.out.println("mybefore：" + name);
	}

	public void mybefore1(String name) {
		System.out.println("mybefore:" + name);
	}

	public void myaftering(String name, int age) {
		System.out.println("后置2个参数 - myaftering");
	}

	public void myafter(String name, int age) {
		System.out.println("myafter：" + name);
	}

	public void mythrow(String name, int age) {
		System.out.println("mythrow");
	}

	public Object myarround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("执行环绕");
		System.out.println("环绕-前置");
		Object result = p.proceed();
		System.out.println("环绕后置");
		return result;
	}
	
}
