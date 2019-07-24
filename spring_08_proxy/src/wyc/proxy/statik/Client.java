package wyc.proxy.statik;

/**
 * 客户
 * @author Yicheng Wang
 */
public class Client {
	public static void main(String[] args) {
		Secretary secretary = new Secretary();
		secretary.eat();
		secretary.work();
	}
}
