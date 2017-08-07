package chapter02.section02.thread_2_2_7.project_4_t9;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List list = new ArrayList();

	synchronized public void add(String data) {
		list.add(data);
	};

	synchronized public int getSize() {
		return list.size();
	};

}
