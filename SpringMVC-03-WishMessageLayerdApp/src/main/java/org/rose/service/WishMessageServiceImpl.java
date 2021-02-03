package org.rose.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements WishMessageService{

	@Override
	public String getWishMessage() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening"; 
		else
			return  "Good Night";
	}

}
