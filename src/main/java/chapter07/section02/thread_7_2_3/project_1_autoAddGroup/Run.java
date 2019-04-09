package chapter07.section02.thread_7_2_3.project_1_autoAddGroup;

public class Run {
	public static void main(String[] args) {
		System.out.println("A处线程："+Thread.currentThread().getName()
				+ " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName()+ " "
				+ " 中有线程组数量："+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group=new ThreadGroup("新的组");
		System.out.println("B处线程："+Thread.currentThread().getName()
				+ " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName()+ " "
				+" 中有线程组数量："+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup=new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("第一个线程组名称为："+threadGroup[i].getName());
		}
	}
}
