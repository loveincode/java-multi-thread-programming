package chapter05.section01.thread_5_1_2.project_3_timerTestCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask{
	@Override
	public void run() {
		System.out.println("B run timer = " + new Date());
	}
}
