package thread_5.thread_5_1.thread_5_1_1.project_3_taskLater;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask{
	@Override
	public void run() {
		System.out.println("B begin timer = " + new Date());
		System.out.println("B   end timer = " + new Date());
	}
}
