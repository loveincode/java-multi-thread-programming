package chapter02.section01.thread_2_1_5.project_1_t3;

public class Test {

	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(200);// ��ӡ����ܴ�ֵ��СӰ��

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
