package org.teamA02.iso;

public class Date {

	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year) {
		
		if(day < 1 || day>31) {
			throw new IllegalArgumentException("Day must be in the range 1-31");
		}
		this.day = day;
		
		if(month<1 || month>12) {
			throw new IllegalArgumentException("Month must in the range 1-12");
		}
		this.month = month;
		
		if(year<1) {
			throw new IllegalArgumentException("Year must be higher than 0");
		}
		this.year = year;
		
	}
	
	// check if the day is correct considering the month(e.g. January has 31 days etc..)
	public boolean DayWithinMonth() {
		if (this.month == 1 || this.month == 3|| this.month == 5|| this.month == 7|| this.month == 8 || this.month == 10|| this.month == 12) {
			return this.day == 31;
		} else if(this.month==2){
			if (IsLeap()) {
				return this.day == 29;
			} else {
				return this.day == 28;
			}
		} else {
				return this.day==30;
		}
	}
	
	//check if the year is a leap year
	public boolean IsLeap() {
		return ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0)));
	}
}
