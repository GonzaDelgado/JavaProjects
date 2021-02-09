package fecha;

import java.util.Calendar;

public class CalendarPrint {
	private int totalDays;
	private int today;
	private int dayOfWeek;
	private int totalWeeks;
	private int firstDayOfWeek;
	
	public void CalendarPrint() {
		Calendar now = Calendar.getInstance();
		int month = now.get(now.MONTH);
		
		switch(month) {
			case 0:
				totalDays = 31;
				break;
			case 1:
				if(now.get(now.YEAR)%4 == 0) {
					totalDays = 29;
				} else {
					totalDays = 28;
				}
				break;
			case 2:
				totalDays = 31;
				break;
			case 3:
				totalDays = 30;
				break;
			case 4:
				totalDays = 31;
				break;
			case 5:
				totalDays = 30;
				break;
			case 6:
				totalDays = 31;
				break;
			case 7:
				totalDays = 31;
				break;
			case 8:
				totalDays = 30;
				break;
			case 9:
				totalDays = 31;
				break;
			case 10:
				totalDays = 30;
				break;
			case 11:
				totalDays = 31;
				break;
		}
		today = now.get(now.DAY_OF_MONTH);
		dayOfWeek = now.get(now.DAY_OF_WEEK);
		totalWeeks = now.get(now.WEEK_OF_MONTH);
		now.set(now.get(now.YEAR), now.get(now.MONTH), 0);
		firstDayOfWeek = now.get(now.DAY_OF_WEEK);
	}
	
	public void calendarPrint() {
		System.out.printf("%4s", "Sun");
		System.out.printf("%4s", "Mon");
		System.out.printf("%4s", "Tue");
		System.out.printf("%4s", "Wed");
		System.out.printf("%4s", "Thu");
		System.out.printf("%4s", "Fry");
		System.out.printf("%4s \n", "Sat");
		int day = 1;
		int tmpDayOfWeek = firstDayOfWeek;
		for(int i = 0; i<totalWeeks;i++) {
			while(tmpDayOfWeek != 0) {
				//imprimir los dias en su ubicacion correcta
			}
		}
	}
}
