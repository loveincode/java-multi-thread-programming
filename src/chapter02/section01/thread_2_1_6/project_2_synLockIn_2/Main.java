package chapter02.section01.thread_2_1_6.project_2_synLockIn_2;

public class Main {

	public int i = 10;

	synchronized public void operateIMainMethod() {
		try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
