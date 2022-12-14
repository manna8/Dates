package org.teamA02.iso.dates;

public class CustomDate {
	int day;
	int month;
	int year;
	
	public CustomDate(int day, int month, int year) {
		if (day < 1 || (month < 1 || month > 12) || year < 1) {
			throw new IllegalArgumentException("Illegal value!");
		}

		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// check if the day is correct (e.g. January has 31 days etc..)
	public boolean DayWithinMonth() {
		if (this.month%2 == 0 && this.month!=8 && this.month!=2) {
			return this.day <= 31;
		} else if(this.month!=2){
			return this.day <= 30;
		} else {
			if (IsLeap()) {
				return this.day <= 29;
			} else {
				return this.day <= 28;
			}
		}
	}
	
	//check if the year is a leap year
	public boolean IsLeap() {
		if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0)))
			return true;
		else
			return false;
	}

}
