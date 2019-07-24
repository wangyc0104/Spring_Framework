package wyc.proxy.statik;

/**
 * 实现职责的老板
 * @author Yicheng Wang
 */
public class Boss implements Function {
	
	private String name;

	public Boss(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("老板与客户吃饭");
	}

	@Override
	public void work() {
		System.out.println("老板与客户谈生意");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
