package chapter03.section04.therad_3_4_2.project_1_InheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

	@Override
	protected Object childValue(Object parentValue) {
		return parentValue + " 我在子线程加的~!";
	}
}
