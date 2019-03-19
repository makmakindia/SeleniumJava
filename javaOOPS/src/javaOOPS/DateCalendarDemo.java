package javaOOPS;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarDemo {

	public static <Calender> void main(String[] args) {
	
		
/*		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf1=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf1.format(d));*/
		SimpleDateFormat d=new SimpleDateFormat("M/d/yyyy hh:mm:ss");

		Calendar cal=Calendar.getInstance();
		System.out.println(d.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(cal.toString());
		
		
		System.out.println(cal.DAY_OF_MONTH+Calendar.MONTH+Calendar.YEAR+Calendar.HOUR+Calendar.MINUTE+Calendar.SECOND+Calendar.MILLISECOND);
	}

}
