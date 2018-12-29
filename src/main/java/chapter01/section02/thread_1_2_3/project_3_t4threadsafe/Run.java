package chapter01.section02.thread_1_2_3.project_3_t4threadsafe;

public class Run {
	
	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}


}
