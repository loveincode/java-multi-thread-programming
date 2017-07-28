package chapter01.section04.project_2_isaliveOtherTest;

public class CountOperate extends Thread {

	public CountOperate() {
		System.out.println("CountOperate---begin");

		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");

		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		System.out.println("run---end");
	}

}

