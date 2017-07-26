package thread_1.thread_1_7.thread_1_7_4.project_2_t15;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for(int i=0;i<100000;i++){
				System.out.println("i="+(i+1));
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止，再遇到了sleep!进入catch!");
			e.printStackTrace();
		}
	}
}

