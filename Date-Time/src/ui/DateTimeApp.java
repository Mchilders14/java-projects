package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Date Time App!");
		
		LocalDateTime currentTimestamp = LocalDateTime.now();
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("Current Datetime: " + currentTimestamp);
		System.out.println("Current date: " + currentDate);
		
		LocalDate halloween = LocalDate.of(2021, 10, 31);
		LocalDate christmas = LocalDate.of(2021, Month.DECEMBER, 25);
		
		System.out.println("Halloween: " + halloween);
		System.out.println("Christmas: " + christmas);
		
		LocalDate july4th = LocalDate.parse("2021-07-04");
		
		System.out.println(july4th);
		
		LocalDateTime laborDay = LocalDateTime.parse("2021-09-06T00:00");
		System.out.println(laborDay);
		
		System.out.println("getYear(): " + currentTimestamp.getYear());
		System.out.println("getMonth(): " + currentTimestamp.getMonth());
		System.out.println("getMonthValue(): " + currentTimestamp.getMonthValue());
		System.out.println("getDayOfMonth(): " + currentTimestamp.getDayOfMonth());
		System.out.println("getDayOfYear(): " + currentTimestamp.getDayOfYear());
		System.out.println("getDayOfWeek(): " +  currentTimestamp.getDayOfWeek());
		System.out.println("getHour(): " + currentTimestamp.getHour());
		System.out.println("getMinute(): " + currentTimestamp.getMinute());
		System.out.println("getSecond(): " + currentTimestamp.getSecond());
		System.out.println("getNano(): " + currentTimestamp.getNano());

		if(currentTimestamp.isBefore(laborDay)) {
			System.out.println("Today is before Labor Day.");
		}
		if(christmas.isAfter(halloween)) {
			System.out.println("Christmas is after Halloween");
		}
		
		System.out.println(halloween.compareTo(christmas));
		System.out.println(christmas.compareTo(july4th));
		
		
		System.out.println("\nBye");
	}

}
