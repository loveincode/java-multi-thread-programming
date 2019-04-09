package chapter02.section01.thread_2_1_6.project_1_synLockIn_1;

public class Service {

	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}

	synchronized public void service2() {
		System.out.println("service2");
		service3();
	}

	synchronized public void service3() {
		System.out.println("service3");
	}

}
