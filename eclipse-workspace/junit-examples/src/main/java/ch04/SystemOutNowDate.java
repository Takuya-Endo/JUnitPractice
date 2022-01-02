package ch04;

import java.util.Date;

public class SystemOutNowDate {

	public String systemOutNowDate() {
		
		Date date = new Date();
		System.out.println(date);
		return date.toString();
		
	}
	
	public Date nowDate() {
		return new Date();
	}
	
}
