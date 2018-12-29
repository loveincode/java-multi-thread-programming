package chapter03.section01.therad_3_1_11.project_1_p_r_test;

public class Run {

	public static void main(String[] args) {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}

}
