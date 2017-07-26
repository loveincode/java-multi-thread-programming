package thread_4.thread_4_1.thread_4_1_3.project_1_UseConditionWaitNotifyError;

public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}

}
