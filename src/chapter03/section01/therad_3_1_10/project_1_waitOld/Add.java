package chapter03.section01.therad_3_1_10.project_1_waitOld;

public class Add {
	
	private String lock;

	public Add(String lock) {
		super();
		this.lock = lock;
	}

	public void add() {
		synchronized (lock) {
			ValueObject.list.add("anyString");
			lock.notifyAll();
		}
	}
	
}
