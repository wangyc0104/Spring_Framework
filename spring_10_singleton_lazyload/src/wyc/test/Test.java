package wyc.test;

import wyc.LazyLoadSingleTon;

/**
 * 测试单例模式
 * @author Yicheng Wang
 */
public class Test {
	public static void main(String[] args) {
		LazyLoadSingleTon singleton1 = LazyLoadSingleTon.getInstance();
		LazyLoadSingleTon singleton2 = LazyLoadSingleTon.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}
