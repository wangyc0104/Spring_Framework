package wyc.proxy.jdk;

/**
 * 实现职业的老板
 * @author Yicheng Wang
 */
public class Boss implements Function{
	
	@Override
	public void eat() {
		System.out.println("老板陪客户吃饭");
	}

	@Override
	public void work() {
		System.out.println("老板与客户谈业务");
	}

}
