package chapter03.section03.therad_3_3_2.project_2_s5;

import java.util.Date;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set(new Date());
				}
				System.out.println("A " + Tools.tl.get().getTime());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
