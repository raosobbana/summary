package com.motocho.portfolio.summary.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimeStamps {
	/*public static void main(String[] args) {
		TimeStamps timeStamps = new TimeStamps();
		List<Long> list = timeStamps.getDateValues();
		System.out.println(list.size());
	}*/
	
	public List<Long> getDateValues(){

		List<Long> list = new ArrayList<>();
		int k=0,j=0;
		for(int i=0; i<120;i++) {
			if(k<=45) {
				Date date = new Date("Mon Oct 28 "+j+":"+k+":17 PDT 2018");
				long value = date.getTime();
				list.add(value);
				//System.out.println(value);
				k=k+15;
				
			}else {
				if(k>45) {
					k=0;
					j++;
				}
			}
		}
		return list;
	}
}
