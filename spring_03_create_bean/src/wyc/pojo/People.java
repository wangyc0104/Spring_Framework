package wyc.pojo;

/**
 * 人类
 * @author Yicheng Wang
 */
public class People {
	
	private int id;
	private String name;

	public People() {
		super();
		System.out.println("执行构造方法");
	}

	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造");
	}

	public People(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造Integer");
	}

	public People(String name, int id) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}
	
}
