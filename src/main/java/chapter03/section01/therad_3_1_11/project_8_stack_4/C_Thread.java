package chapter03.section01.therad_3_1_11.project_8_stack_4;

public class C_Thread extends Thread {

	private C r;

	public C_Thread(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.popService();
		}
	}

}
