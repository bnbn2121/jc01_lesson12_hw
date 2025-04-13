package com.edu.less12.homework02;

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		time.showLongTime();
		System.out.println();
		
		time.setTime(11, 56, 22);
		time.showLongTime();
		System.out.println();
		
		time.setTime(24, 00, -11);
		time.showLongTime();
		System.out.println();
		
		time.setHour(8);
		time.setMinute(1);
		time.showShortTime();
		System.out.println();
		
		time.setTime(0, 0, 0);
		time.showShortTime();
		time.addTime(1,16,12);
		time.showShortTime();
		System.out.println();
		
		time.setTime(22, 0, 0);
		time.showShortTime();
		time.addSeconds(-1);
		time.showShortTime();
		System.out.println();

	}

}
