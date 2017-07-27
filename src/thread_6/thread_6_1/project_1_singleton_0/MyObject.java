package thread_6.thread_6_1.project_1_singleton_0;

public class MyObject {

	// 立即加载方式==饿汉模式
	private static MyObject myObject = new MyObject();

	private MyObject() {
	}

	public static MyObject getInstance() {
		// 此代码版本为立即加载
		// 此版本代码的缺点是不能有其它实例变量
		// 因为getInstance()方法没有同步
		// 所以有可能出现非线程安全问题
		return myObject;
	}

}
