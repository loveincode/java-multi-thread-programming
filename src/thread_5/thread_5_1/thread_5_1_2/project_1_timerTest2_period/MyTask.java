package thread_5.thread_5_1.thread_5_1_2.project_1_timerTest2_period;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("任务执行了，时间为："+new Date());
	}
}
