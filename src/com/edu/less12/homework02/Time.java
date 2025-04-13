package com.edu.less12.homework02;

/*
 * Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой
 * допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы
 * изменения времени на заданное количество часов, минут и секунд.
 */
public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public Time() {
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute > 59 || minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second > 59 || second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void showLongTime() {
		System.out.printf("Установленное время:\n%d часов, %d минут, %d секунд\n", hour, minute, second);
	}

	public void showShortTime() {
		String h = String.format("%02d", hour);
		String m = String.format("%02d", minute);
		String s = String.format("%02d", second);
		System.out.printf("Установленное время: %s:%s:%s\n", h, m, s);
	}

	public void addSeconds(int sec) {
		int max = 24 * 60 * 60;
		int current = hour * 60 * 60 + minute * 60 + second;
		if ((current + sec) >= max || (current + sec) <= 0) {
			setTime(0, 0, 0);
		} else {
			setSecond((current + sec) % 60);
			setMinute((current + sec) / 60 % 60);
			setHour((current + sec) / 60 / 60);
		}
	}

	public void addMinutes(int min) {
		int sec = min * 60;
		addSeconds(sec);
	}

	public void addHours(int hours) {
		int sec = hours * 60 * 60;
		addSeconds(sec);
	}

	public void addTime(int hours, int minutes, int seconds) {
		int sec = hours * 60 * 60 + minutes * 60 + seconds;
		addSeconds(sec);
	}

}
