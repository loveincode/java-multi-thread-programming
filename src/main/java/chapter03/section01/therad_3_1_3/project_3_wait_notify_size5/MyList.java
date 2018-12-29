package chapter03.section01.therad_3_1_3.project_3_wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private static List list = new ArrayList();

	public static void add() {
		list.add("anyString");
	}

	public static int size() {
		return list.size();
	}

}
