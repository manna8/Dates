package org.teamA02.iso;


	public class CustomDate {

		int day;
		int month;
		int year;
		
		public CustomDate(int day, int month, int year) {
			
			if(day < 1 || day>31) {
				throw new IllegalArgumentException("Day must be in the range 1-31");
			}
			this.setDay(day);
			
			if(month<1 || month>12) {
				throw new IllegalArgumentException("Month must in the range 1-12");
			}
			this.setMonth(month);
			
			if(year<0) {
				throw new IllegalArgumentException("Year must be higher than 0");
			}
			this.setYear(year);
			
		}
		
		// check if the day is correct considering the month(e.g. January has 31 days etc..)
		public boolean DayWithinMonth(){
			if (this.getMonth()==1 || this.getMonth()==3||this.getMonth()==5|| this.getMonth()==7|| this.getMonth()==8 || this.getMonth()==10|| this.getMonth() == 12) {
				return this.getDay() <= 31;
			} else if(this.getMonth()==2){
				return this.getDay() <= 29;
			} else {
				return this.getDay()<=30;
			}
		}
		
		//check if the year is a leap year
		public boolean IsLeap(){
			
			boolean is_leap=false;
			try {
				
				if(DayWithinMonth())
					if ((this.getYear() % 4 == 0) && ((this.getYear() % 100 != 0) || (this.getYear() % 400 == 0)))
						if(this.getDay()!=29 || this.getMonth()!=2)
							is_leap=true;
					else
						is_leap=false;
			}catch(DayWithinMonthException e){
					System.out.println("The day introduced is not compatible with the month");
			}
			return is_leap;
		}
			

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

	}
