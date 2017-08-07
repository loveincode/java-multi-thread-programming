package chapter01.section10.thread_1_10_2.project_1_t19;

import java.util.Random;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		long addResult = 0;
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 50000; i++) {
				Random random = new Random();
				random.nextInt();
				addResult = addResult + i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("☆☆☆☆☆thread 2 use time=" + (endTime - beginTime));
	}

}
