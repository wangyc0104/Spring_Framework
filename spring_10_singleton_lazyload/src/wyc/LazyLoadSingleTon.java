package wyc;

/**
 * 懒鬼加载单例（更详细的去翻翻23种设计模式中的源码）
 * @author Yicheng Wang
 */
public class LazyLoadSingleTon {

	// 由于对象需要被静态方法调用，把方法设置为static
	// 由于对象是static，必须要设置访问权限修饰符为private
	// 如果是public可以直接调用对象，不执行访问入口，破坏封装
	private static LazyLoadSingleTon lazyLoadSingleton;

	/**
	 * 方法名和类名相同 无返回值<br>
	 * 其他类不能实例化这个类对象<br>
	 * 对外提供访问入口<br>
	 */
	private LazyLoadSingleTon() { }

	/**
	 * 实例方法必须通过对象调用<br>
	 * 设置方法为静态方法<br>
	 * @return 该类的实例
	 */
	public static LazyLoadSingleTon getInstance() {
		// 如果实例化过，直接返回
		if (lazyLoadSingleton == null) {
			// 多线程访问下,可能出现if同时成立的情况,添加锁
			synchronized (LazyLoadSingleTon.class) {
				// 双重验证
				if (lazyLoadSingleton == null) {
					lazyLoadSingleton = new LazyLoadSingleTon();
				}
			}
		}
		return lazyLoadSingleton;
	}
	
}
