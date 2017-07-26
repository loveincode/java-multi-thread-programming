package thread_4.thread_4_1.thread_4_1_3.project_2_z3ok;

public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThreadA a = new MyThreadA(myService);
		a.start();
	}
}
