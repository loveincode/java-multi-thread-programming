package chapter03.section03.therad_3_3_2.project_1_ThreadLocalTest;

public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set("ThreadB" + (i + 1));
				} else {
					System.out.println("ThreadB get Value=" + Tools.tl.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
