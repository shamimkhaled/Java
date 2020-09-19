
package problem_03;

import java.util.GregorianCalendar;

public class Main {
    
    public static void main(String[] args) {
		
		GregorianCalendar calender = new GregorianCalendar();
		System.out.println("Current Year: "+calender.get(GregorianCalendar.YEAR));
		System.out.println("Current Month: "+calender.get(GregorianCalendar.MONTH));
                System.out.println("Current Day_Of_Month: "+calender.get(GregorianCalendar.DAY_OF_MONTH ));

		calender.setTimeInMillis(1234567898765L);

		System.out.println("Elapsed time since January 1, 1970 set to 1234567898765L in formate: ");
		System.out.println("Year: "+calender.get(GregorianCalendar.YEAR));
		System.out.println("Month: "+calender.get(GregorianCalendar.MONTH));
                System.out.println("Day_Of_Month: "+calender.get(GregorianCalendar.DAY_OF_MONTH ));
	}
    }
    

