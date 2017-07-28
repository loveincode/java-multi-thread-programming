package chapter05.section01.thread_5_1_2.project_1_timerTest2_period;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND,calendarRef.get(Calendar.SECOND) -10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, runDate, 4000);
	}
}
