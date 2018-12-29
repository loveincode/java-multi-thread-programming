package chapter03.section01.therad_3_1_14.project_1_wait_notify_insert_test;

public class Run {

	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for (int i = 0; i < 20; i++) {
			BackupB output = new BackupB(dbtools);
			output.start();
			BackupA input = new BackupA(dbtools);
			input.start();
		}
	}

}
