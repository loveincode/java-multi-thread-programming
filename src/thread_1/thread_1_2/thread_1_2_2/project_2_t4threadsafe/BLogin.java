package thread_1.thread_1_2.thread_1_2_2.project_2_t4threadsafe;

public class BLogin extends Thread {
	
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
