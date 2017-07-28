package chapter01.section02.thread_1_2_3.project_3_t4threadsafe;

public class ALogin extends Thread {
	
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}

