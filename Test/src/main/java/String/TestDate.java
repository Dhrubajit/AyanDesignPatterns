package main.java.String;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dd = new Date(2019,06,14);
		Date cd = new Date(2019,06,20);
		
		
		numberOfDayBetweenTwoDate(cd,dd);
	}

	
	public static void numberOfDayBetweenTwoDate(Date CD,Date DD) {
		if (CD!=null){
			if (DD!=null){
				long msCD = CD.getTime();
				long msDD = DD.getTime();
				System.out.println(Math.round((float)((double)(msDD-msCD))/1000/60/60/24));
			}
		}
	}
}
