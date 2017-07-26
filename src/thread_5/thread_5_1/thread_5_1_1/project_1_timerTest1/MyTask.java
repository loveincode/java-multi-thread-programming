package thread_5.thread_5_1.thread_5_1_1.project_1_timerTest1;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("任务执行了，时间为："+new Date());
	}

}
