package chapter02.section02.thread_2_2_7.project_3_syn_Out_asyn;

public class Test {

	public static void main(String[] args) {
		MyList mylist = new MyList();

		MyThreadA a = new MyThreadA(mylist);
		a.setName("A");
		a.start();

		MyThreadB b = new MyThreadB(mylist);
		b.setName("B");
		b.start();
	}

}
