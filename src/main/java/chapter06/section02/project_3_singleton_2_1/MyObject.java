package chapter06.section02.project_3_singleton_2_1;

public class MyObject {
	private static MyObject myObject;

	private MyObject() {
	}

	// 设置同步方法效率太低了
	// 整个方法被上锁
	synchronized public static MyObject getInstance() {
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
