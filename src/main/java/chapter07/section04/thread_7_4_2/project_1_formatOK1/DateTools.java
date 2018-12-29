package chapter07.section04.thread_7_4_2.project_1_formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
	public static Date parse(String formatPattern, String dateString)
			throws ParseException {
		return new SimpleDateFormat(formatPattern).parse(dateString);
	}

	public static String format(String formatPattern, Date date) {
		return new SimpleDateFormat(formatPattern).format(date).toString();
	}

}
