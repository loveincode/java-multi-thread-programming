package chapter02.section02.thread_2_2_1.project_1_t5;

public class Task {

	private String getData1;
	private String getData2;

	public synchronized void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "长时间处理任务后从远程返回的值1threadName="
					+ Thread.currentThread().getName();
			getData2 = "长时间处理任务后从远程返回的值2threadName="
					+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
