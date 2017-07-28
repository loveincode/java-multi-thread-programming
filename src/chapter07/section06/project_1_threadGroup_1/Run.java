package chapter07.section06.project_1_threadGroup_1;

public class Run {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("我的线程组");
		MyThread[] myThread = new MyThread[10];
		for (int i = 0; i < myThread.length; i++) {
			myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
			myThread[i].start();
		}
		MyThread newT = new MyThread(group, "报错线程", "a");
		newT.start();
	}
}
