package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run2 {
	
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？=" + Thread.interrupted());
		System.out.println("是否停止2？=" + Thread.interrupted());
		System.out.println("end!");
	}

}
