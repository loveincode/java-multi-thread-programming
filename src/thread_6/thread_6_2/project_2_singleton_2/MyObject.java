package thread_6.thread_6_2.project_2_singleton_2;

public class MyObject {
	
	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建对象之前做一些准备性的工作
				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
