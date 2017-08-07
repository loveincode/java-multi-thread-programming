package chapter02.section02.thread_2_2_3.project_1_t6;

public class Task {

	private String getData1;
	private String getData2;

	public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);

			String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName="
					+ Thread.currentThread().getName();
			String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName="
					+ Thread.currentThread().getName();

			synchronized (this) {
				getData1 = privateGetData1;
				getData2 = privateGetData2;
			}
			
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
