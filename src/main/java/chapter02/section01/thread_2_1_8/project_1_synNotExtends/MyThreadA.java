package chapter02.section01.thread_2_1_8.project_1_synNotExtends;

public class MyThreadA extends Thread {

	private Sub sub;

	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}

}
