package chapter06.section02.project_1_singleton_1;

public class MyObject {
	
	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		// 延迟加载
		if (myObject != null) {
		} else {
			myObject = new MyObject();
		}
		return myObject;
	}
	
}
