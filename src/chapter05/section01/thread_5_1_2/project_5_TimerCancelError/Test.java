package chapter05.section01.thread_5_1_2.project_5_TimerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
	
	public static void main(String[] args) {
		int i = 0;
		Calendar canlendarRef1 = Calendar.getInstance();
		Date runDate1 = canlendarRef1.getTime();
		while(true) {
			i++;
			Timer timer = new Timer();
			MyTaskA task1 = new MyTaskA(i);
			timer.schedule(task1, runDate1);
			timer.cancel();
		}
	}

}
