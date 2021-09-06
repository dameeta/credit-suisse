package DateExamples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Date1Example {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d1=new Date();
		System.out.println(d1);
	  LocalDate d=LocalDate.now();
	  System.out.println(d);
	  LocalTime t=LocalTime.now();
	  System.out.println(t);
	LocalDateTime td=LocalDateTime.now();
	System.out.println(td);
	System.out.println("Enter the date");
	Scanner sc=new Scanner(System.in);
	String userdate=sc.next();
	//Date dd=new SimpleDateFormat("dd/MM/yyyy").parse(userdate);
	
	SimpleDateFormat sd1=new SimpleDateFormat("dd-MMM-yyyy");
	
	System.out.println("The parsed date is" + sd1.parse(userdate));
	
	Date dobj=Calendar.getInstance().getTime();
	DateFormat df1=new SimpleDateFormat("mm-dd-yyyy:hh:mm:ss");
	String newdate = df1.format(dobj);
	
	System.out.println(newdate);
	}

}
