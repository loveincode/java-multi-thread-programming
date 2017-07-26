package thread_5.thread_5_1.thread_5_1_1.project_2_timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;


public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND,calendarRef.get(Calendar.SECOND) -10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, runDate);
	}

}
