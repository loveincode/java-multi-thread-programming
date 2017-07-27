package thread_6.thread_6_2.project_6_singleton_5;

public class MyObject {
	
	private volatile static MyObject myObject;

	private MyObject() {
	}

	// 使用双检测机制来解决问题
	// 即保证了不需要同步代码的异步
	// 又保证了单例的效果
	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建对象之前做一些准备性的工作
				Thread.sleep(3000);
				synchronized (MyObject.class) {
					if (myObject == null) {
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
	// 此版本的代码称为：
	// 双重检查Double-Check Locking


}
