package chapter02.section01.thread_2_1_2.project_1_t2;

public class Run {
	public static void main(String[] args) {

		HasSelfPrivateNum numRef = new HasSelfPrivateNum();

		ThreadA athread = new ThreadA(numRef);
		athread.start();

		ThreadB bthread = new ThreadB(numRef);
		bthread.start();

	}
}
