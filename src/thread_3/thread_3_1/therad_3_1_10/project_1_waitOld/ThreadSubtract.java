package thread_3.thread_3_1.therad_3_1_10.project_1_waitOld;

public class ThreadSubtract extends Thread {

	private Subtract r;

	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		r.subtract();
	}

}