package chapter02.section02.thread_2_2_7.project_2_synBlockString2;

public class Service {

	private String anyString = new String();

	public void a() {
		try {
			synchronized (anyString) {
				System.out.println("a begin");
				Thread.sleep(3000);
				System.out.println("a   end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void b() {
		System.out.println("b begin");
		System.out.println("b   end");
	}

}
