package com.fchavez.jashinhurst.hw3.two;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
/**
 * <p>This class only has a main class. the main class gets
 * a calendar date of the current time and converts it to
 * two formats and prints to the terminal. It also tells what
 * day of the year it is as well.  
 * 
 * @author Franz Chavez
 * @author Joshua Ashinhurst
 * @version hw3 #3
 * @bugs none
 */
public class Time {
	public static void main(String Args[]){
		GregorianCalendar t = new GregorianCalendar();
		SimpleDateFormat s = new SimpleDateFormat("mm.dd.yyyy hh:mm:ss a");
		System.out.print(t.get(Calendar.MONTH));
		System.out.print("/"+ t.get(Calendar.DAY_OF_MONTH));
		System.out.print("/" + t.get(Calendar.YEAR));
		System.out.print(" " + t.get(Calendar.HOUR)+":");
		System.out.print(t.get(Calendar.MINUTE) + " ");
		System.out.println(t.getDisplayName(Calendar.AM_PM,Calendar.LONG, Locale.getDefault()));
		System.out.print(t.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
		System.out.println(" " + s.format(t.getTime()));
		System.out.print("which is the " + t.get(Calendar.DAY_OF_YEAR));
		switch(t.get(Calendar.DAY_OF_YEAR)){
		case 1:
			System.out.print("st");
			break;
		case 2:
			System.out.print("nd");
			break;
		case 3:
			System.out.print("rd");
			break;
		default:
			System.out.print("th");
			break;
		}
		System.out.println(" day of the year");
	}
}
