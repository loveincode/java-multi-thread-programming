package chapter06.section04.project_1_singleton_7_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {

	private static final long serialVersionUID = 888L;

	// 内部类方式
	private static class MyObjectHandler {
		private static final MyObject myObject = new MyObject();
	}

	private MyObject() {
	}

	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}

//	protected Object readResolve() throws ObjectStreamException {
//		System.out.println("调用了readResolve方法！");
//		return MyObjectHandler.myObject;
//	}
}
