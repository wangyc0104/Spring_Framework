package wyc.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis初始化工具
 * @author Yicheng Wang
 */
public class MyBatisUtil {

	/**
	 * SessionFactory实例化的过程是一个比较耗费性能的过程 <br>
	 * 利用ThreadLocal保证SessionFactory的单例以提升性能 <br>
	 */
	private static SqlSessionFactory factory;
	private static ThreadLocal<SqlSession> tl = new ThreadLocal<>();
	static {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取SqlSession的方法
	 */
	public static SqlSession getSession() {
		SqlSession session = tl.get();
		if (session == null) {
			tl.set(factory.openSession());
		}
		return tl.get();
	}

	/**
	 * 关闭资源
	 */
	public static void closeSession() {
		SqlSession session = tl.get();
		if (session != null) {
			session.close();
		}
		tl.set(null);
	}

}
