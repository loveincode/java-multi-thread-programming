package chapter02.section02.thread_2_2_7.project_4_t9;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();

		MyThread1 thread1 = new MyThread1(list);
		thread1.setName("A");
		thread1.start();

		MyThread2 thread2 = new MyThread2(list);
		thread2.setName("B");
		thread2.start();
		
		Thread.sleep(6000);
		
		System.out.println("listSize=" + list.getSize());

	}

}
