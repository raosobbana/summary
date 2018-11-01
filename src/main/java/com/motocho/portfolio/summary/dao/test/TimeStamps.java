package com.motocho.portfolio.summary.dao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class TimeStamps {
	/*public static void main(String[] args) {
		TimeStamps timeStamps = new TimeStamps();
		//List<Long> list = timeStamps.getDayValues();
		//System.out.println(list.size());
	}*/
	
	public List<Long> getDayValues(){
		List<Long> list = new ArrayList<>();
		//int counter=1;
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar c = Calendar.getInstance();
		String str = date.toString();//"Thu Nov 01 00:00:02 IST 2018";
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		for(int i=1; i<=96;i++) {
			try {
				date = df.parse(c.getTime().toString());
				long value = date.getTime();
				list.add(value);
				c.add(Calendar.MINUTE, -15);				
				//System.out.println("counter:"+counter+"\t"+value+" "+date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//counter++;
		}
		return list;
	
	}

	public List<Long> getWeekValues(){

		List<Long> list = new ArrayList<>();
		//int counter=1;
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar c = Calendar.getInstance();
		String str = date.toString();//"Thu Nov 01 00:00:02 IST 2018";date.toString();
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		for(int i=1; i<=672;i++) {
			try {
				date = df.parse(c.getTime().toString());
				long value = date.getTime();
				list.add(value);
				c.add(Calendar.MINUTE, -15);				
				//System.out.println("counter:"+counter+"\t"+value+" "+date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//counter++;
		}
		return list;
	}
	
	public List<Long> getMonthValues(){

		List<Long> list = new ArrayList<>();
		//int counter=1;
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar c = Calendar.getInstance();
		String str = date.toString();//"Thu Nov 01 00:00:02 IST 2018";
		
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		for(int i=1; i<=720;i++) {
			try {
				date = df.parse(c.getTime().toString());
				long value = date.getTime();
				list.add(value);
				c.add(Calendar.HOUR,-1);				
				//System.out.println("counter:"+counter+"\t"+value+" "+date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//counter++;
		}
		return list;
	}
	
	public List<Long> getMonthMoreValues(){

		List<Long> list = new ArrayList<>();
		Date date = new Date();
		//int counter=01;
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar c = Calendar.getInstance();
		String str =date.toString();// "Thu Nov 01 00:00:02 IST 2018";
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		for(int i=1; i<=920;i++) {
			try {
				date = df.parse(c.getTime().toString());
				long value = date.getTime();
				list.add(value);
				c.add(Calendar.HOUR,-1);				
				//System.out.println("counter:"+counter+"\t"+value+" "+date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//counter++;
		}
		return list;
	}
	
	public List<Long> getYearValues(){

		List<Long> list = new ArrayList<>();
		Date date = new Date();
		int days = LocalDate.now().getDayOfYear();
		//LocalDate localDate = LocalDate.now().withDayOfYear( 200 );
		//int days = localDate.getDayOfYear();//.getDayOfYear();
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar c = Calendar.getInstance();
		String str = date.toString();//"Thu Jan 01 00:00:02 IST 2018";date.toString();
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		for(int i=1; i<=days;i++) {
			try {
				date = df.parse(c.getTime().toString());
				long value = date.getTime();
				list.add(value);
				c.add(Calendar.DATE,-1);				
				//System.out.println("counter:"+counter+"\t"+value+" "+date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public List<Long> getAllValues(){

		List<Long> list = new ArrayList<>();
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar c = Calendar.getInstance();
		String str = date.toString();//"Thu Jan 01 00:00:02 IST 2018";date.toString();
		try {
			c.setTime(df.parse(str));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		for(int i=1; i<=2555;i++) {
			try {
				date = df.parse(c.getTime().toString());
				long value = date.getTime();
				list.add(value);
				c.add(Calendar.DATE,-1);				
				//System.out.println("counter:"+counter+"\t"+value+" "+date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
