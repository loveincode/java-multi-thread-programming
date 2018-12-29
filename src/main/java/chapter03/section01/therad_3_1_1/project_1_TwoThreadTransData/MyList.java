package chapter03.section01.therad_3_1_1.project_1_TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();

	public void add() {
		list.add("高洪岩");
	}

	public int size() {
		return list.size();
	}

}
