package chapter03.section02.therad_3_2_1.project_1_joinTest1;

public class Test {

	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();

		// Thread.sleep(?)
		System.out.println("我想当threadTest对象执行完毕后我再执行");
		System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
		System.out.println("答案是：根据不能确定:)");
	}

}
