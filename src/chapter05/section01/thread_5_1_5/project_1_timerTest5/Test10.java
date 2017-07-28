package chapter05.section01.thread_5_1_5.project_1_timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import chapter05.section01.thread_5_1_5.project_1_timerTest5.Test9.MyTask;

public class Test10 {
	
	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("begin timer = " + new Date());
			System.out.println("  end timer = " + new Date());
		}
	}

	public static void main(String[] args) {
		MyTask task = new MyTask();
		System.out.println("现在执行时间：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("计划执行时间：" + runDate);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, runDate, 2000);
	}
	
}
