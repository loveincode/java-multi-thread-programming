package chapter07.section06.project_2_threadGroup_2;

public class Run {
	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("我的线程组");
		MyThread[] myThread = new MyThread[10];
		for (int i = 0; i < myThread.length; i++) {
			myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
			myThread[i].start();
		}
		MyThread newT = new MyThread(group, "报错线程", "a");
		newT.start();
	}

}
