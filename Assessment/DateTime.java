package com.ss.assessment.datetime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
	/*
	 * 1.)
	 * LocalDateTime - would be used for storing birthday in years, months, days, seconds
	 * & nanoseconds
	 */
	
	/*
	 * 2.)
	 *  You could use the TemporalAdjusters class to manipulate LocalDate instance
	 *  by using the DayOfWeek enum like
	 *  TemporalAdjusters.previous(DayOfWeek.THURSDAY)
	 */
	
	/*
	 * 3.)
	 * ZoneId is a class that identifies a specific time zone based on the region
	 * and defines the rule for converting between instant and LocalDateTime
	 * ZoneOffset identifies the amount of time difference between given timezone
	 * and the UTC/Greenwhich timezone
	 */
	
	/*
	 * 4.)
	 */
	
	public static void main(String[] args) {
		Instant instant = Instant.now();
		// converting Instant to ZoneDateTime
		ZonedDateTime zoned = instant.atZone(ZoneId.of("America/New_York"));
		System.out.println(zoned);
		
		// convert back to Instant
		System.out.println(zoned.toInstant());
		
	}
	/*
	 * 5.)
	 * following example gives length of each month of given year
	 */
	public void reportLengthMonths(Year year) {
		for(int mon = 1; mon <= 12; mon++) {
			int length = year.atMonth(mon).lengthOfMonth();
			System.out.println(length);
		}
	}
	
	/*
	 * 6.)
	 * following example gives list of all Mondays in that month
	 */
	
	public void reportMondays(YearMonth mon) {
		LocalDate monday = mon.atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		for (LocalDate day = monday; !day.isAfter(mon.atEndOfMonth()); day = day.plusWeeks(1)) {
			System.out.println(day.format(DateTimeFormatter.ofPattern("MMMM dd")));
		}
	}
	
	
	/*
	 * 7.)
	 * following example tests (true/false) whether given date occurs on Friday the 13th
	 */
	public boolean fridayThe13(LocalDate date) {
		return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
	}
	
	
	
	

	
	
}
