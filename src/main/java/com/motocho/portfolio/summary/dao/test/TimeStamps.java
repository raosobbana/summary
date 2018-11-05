package com.motocho.portfolio.summary.dao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TimeStamps {
	/*public static void main(String[] args) {
		TimeStamps timeStamps = new TimeStamps();
		List<Long> list = timeStamps.getDayValues();
		System.out.println(list.size());
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
		
		Collections.reverse(list); 
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
		Collections.reverse(list); 
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
		Collections.reverse(list); 
		return list;
	}

	public List<Long> getYtdValues(){

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
		Collections.reverse(list); 
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
		Collections.reverse(list); 
		return list;
	}

	private String getRandomCoinName() {
		List<String> user1Coins = new ArrayList<String>();
		user1Coins.add("Bitcoin");
		user1Coins.add("Ethereum");
		user1Coins.add("Litecoin");
		user1Coins.add("Ripple");
		user1Coins.add("Cardano");
		user1Coins.add("Stellar");
		int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
		return user1Coins.get(coinIndex);
	}
	
	private String getRandomTransactionType() {
		List<String> user1Coins = new ArrayList<String>();
		user1Coins.add("BUY");
		user1Coins.add("SELL");
		int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
		return user1Coins.get(coinIndex);
	}
	
	private long getRandomCoinId(String str) {
		long val =0;
		switch(str) {
		case "Bitcoin":
			val = 1001;
			break;
		case "Ethereum":
			val = 1002;
			break;
		case "Litecoin":
			val = 1003;
			break;
		case "Ripple":
			val = 1004;
			break;
		case "Cardano":
			val = 1004;
			break;
		case "Stellar":
			val = 1005;
			break;
		}
		return val;
	}
	
	private String getRandomCoinCode(String str) {
		String val ="";
		switch(str) {
		case "Bitcoin":
			val = "BTC";
			break;
		case "Ethereum":
			val = "ETH";
			break;
		case "Litecoin":
			val = "LTC";
			break;
		case "Ripple":
			val = "XRP";
			break;
		case "Cardano":
			val = "ADA";
			break;
		case "Stellar":
			val = "XLM";
			break;
		}
		return val;
	}

	private double getRandomCoinValue(String name) {
		double val =0;
		switch(name) {
		case "Bitcoin":
			val = 7000*Math.random();
			break;
		case "Ethereum":
			val = 200*Math.random();
			break;
		case "Litecoin":
			val = 50*Math.random();
			break;
		case "Ripple":
			val = 1*Math.random();
			break;
		case "Cardano":
			val = (0.1)*Math.random();
			break;
		case "Stellar":
			val = 1*Math.random();
			break;
		}
		return val;
	}

	private long getRandomUserId() {
		List<Long> user1Coins = new ArrayList<Long>();
		CopyOnWriteArrayList<Long> userIds = new CopyOnWriteArrayList<Long>();
		
		user1Coins.add(1l);
		user1Coins.add(2l);
		user1Coins.add(3l);
		int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
		return user1Coins.get(coinIndex);
	}

	private long getRandomPositionId() {
		List<Long> user1Coins = new ArrayList<Long>();
		user1Coins.add(2001l);
		user1Coins.add(3001l);
		user1Coins.add(4001l);
		int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
		return user1Coins.get(coinIndex);
	}

	private long getRandomPositionLotId(long positionId) {
		List<Long> user1Coins = new ArrayList<Long>();
		user1Coins.add(2001l);
		user1Coins.add(3001l);
		user1Coins.add(4001l);
		int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
		return user1Coins.get(coinIndex);
	}
}
