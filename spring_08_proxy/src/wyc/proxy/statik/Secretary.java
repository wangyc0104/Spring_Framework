package wyc.proxy.statik;

/**
 * 秘书（静态代理）
 * @author Yicheng Wang
 */
public class Secretary implements Function{
	
	private Boss boss = new Boss("王思聪");

	@Override
	public void eat() {
		System.out.println("==========有客户要找老板吃饭！==========");
		System.out.println("秘书帮老板订餐馆");
		boss.eat();
		System.out.println("秘书叫滴滴送客人回去");
	}

	@Override
	public void work() {
		System.out.println("==========有客户要找老板洽谈！==========");
		System.out.println("秘书帮老板订会议室");
		boss.work();
		System.out.println("秘书帮老板记录洽谈的内容");
	}
	
}
