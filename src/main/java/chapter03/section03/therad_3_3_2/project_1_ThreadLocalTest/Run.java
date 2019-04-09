package chapter03.section03.therad_3_3_2.project_1_ThreadLocalTest;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadA a = new ThreadA();
			ThreadB b = new ThreadB();
			a.start();
			b.start();

			for (int i = 0; i < 100; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set("Main" + (i + 1));
				} else {
					System.out.println("Main get Value=" + Tools.tl.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
