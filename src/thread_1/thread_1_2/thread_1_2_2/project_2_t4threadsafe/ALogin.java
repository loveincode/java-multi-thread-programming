package thread_1.thread_1_2.thread_1_2_2.project_2_t4threadsafe;

public class ALogin extends Thread {
	
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}

