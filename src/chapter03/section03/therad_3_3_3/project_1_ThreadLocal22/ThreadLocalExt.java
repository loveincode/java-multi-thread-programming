package chapter03.section03.therad_3_3_3.project_1_ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "我是默认值 第一次get不再为null";
	}
}
