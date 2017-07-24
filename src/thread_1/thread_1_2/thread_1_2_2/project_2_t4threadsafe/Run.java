package thread_1.thread_1_2.thread_1_2_2.project_2_t4threadsafe;

public class Run {
	
	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}


}
