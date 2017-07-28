package chapter07.section07.project_1_threadExceptionMove;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		System.out.println("线程组的异常处理");
		e.printStackTrace();
	}

}
