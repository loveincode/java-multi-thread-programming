package thread_6.thread_6_5.project_1_singleton_8;

public class MyObject {
	
	private static MyObject instance = null;

	private MyObject() {
	}

	static {
		instance = new MyObject();
	}

	public static MyObject getInstance() {
		return instance;
	}
	
}
