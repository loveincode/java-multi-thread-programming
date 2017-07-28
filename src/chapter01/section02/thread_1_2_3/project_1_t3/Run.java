package chapter01.section02.thread_1_2_3.project_1_t3;

public class Run {
	
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}

}
