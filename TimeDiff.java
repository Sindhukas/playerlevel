package Playcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDiff {
	public static void main(String[] args)throws Exception{
		String time1="06:00 AM";
		String time2="06:20 AM";
		
		String format="HH:MM aa";
		
		SimpleDateFormat sdf= new SimpleDateFormat(format);
		
		Date dateObj1=null;
		Date dateObj2=null;
		try{
		dateObj1=sdf.parse(time1);
		dateObj2=sdf.parse(time2);
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		long diff=dateObj2.getTime()-dateObj2.getTime();
		double diffInhr=diff/((double)1000*60*60);
		double diffInmin=(diffInhr+(int)diffInhr)*60;
		System.out.println("Diff:"+diff);
		System.out.println("Difference in hours:"+diffInhr);
		System.out.println("Difference in minutes:"+diffInmin);
	}
}
