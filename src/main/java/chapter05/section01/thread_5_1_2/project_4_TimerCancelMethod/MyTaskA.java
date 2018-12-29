package chapter05.section01.thread_5_1_2.project_4_TimerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask{
	@Override
	public void run() {
		System.out.println("A run timer = " + new Date());
	}
}
