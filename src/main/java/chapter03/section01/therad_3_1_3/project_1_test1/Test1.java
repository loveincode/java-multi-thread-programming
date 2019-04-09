package chapter03.section01.therad_3_1_3.project_1_test1;

public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
