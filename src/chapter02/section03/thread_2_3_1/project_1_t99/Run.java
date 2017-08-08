package chapter02.section03.thread_2_3_1.project_1_t99;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它！stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
