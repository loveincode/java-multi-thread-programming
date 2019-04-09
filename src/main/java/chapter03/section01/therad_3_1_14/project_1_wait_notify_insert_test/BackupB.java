package chapter03.section01.therad_3_1_14.project_1_wait_notify_insert_test;

public class BackupB extends Thread {

	private DBTools dbtools;

	public BackupB(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}

	@Override
	public void run() {
		dbtools.backupB();
	}

}
