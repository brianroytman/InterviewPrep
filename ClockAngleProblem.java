import java.util.*;
import java.lang.*;


public class ClockAngleProblem {
	public static void main(String args[])
	{
		/*
		int hour = 9;
		int min = 24; 
		System.out.println(calculateAngle(hour, min));
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the time represented in hour:minutes form");
		String time = input.nextLine();
		String[] timeHolder = time.split(":");
		int hour = Integer.parseInt(timeHolder[0]);
		int minutes = Integer.parseInt(timeHolder[1]);
		double finalAngle = calculateAngle(hour, minutes);
		
		System.out.println(finalAngle);
		
	}
	
	public static double calculateAngle(int x, int y)
	{
		double trueHourHand = getTrueHourHand(y);
		int unAdjustedHourHand = getUnadjustedHour(x);
		int minuteHand = getMinuteHand(y);
		
		double angle = Math.abs((trueHourHand + unAdjustedHourHand) - minuteHand); //Final angle is the difference between the true hour hand relative to 12 and the minute hand relative to 12
		return angle;
	}
	
	public static double getTrueHourHand(int y)
	{
		/*
		 * True hour hand represents the angle between where the hour hand is truly located and where it would be exactly at the top of the hour
		 * The true hour hand  location depends on the minutes that have passed during this hour, thus represented by (y minutes/60 minutes)
		 * Each hour on the clock represents 1/12 of a full 360 degree revolution, so each hour is a new 30 degree chunk
		 * The degree location of the adjusted hour will be represented by (y minutes/60 minutes) * 30 degrees
		 * This simplifies to y/2
		 */
		
		double trueHourHandAngle = (double) y/2;
		return trueHourHandAngle;
		
	}
	
	public static int getUnadjustedHour(int x)
	{
		/*
		 * Unadjusted hour hand represents the angle between the hour and minute hand if the hour did not move relative to the minutes passing (only moving at the top of each hour)
		 * Since each hour represents 1/12 of a revolution, the degrees between the unadjusted hour hand  and 12 is (x hours/12 hours) * 360 degrees
		 * This simplifies to x * 30
		 */
		int unadjustedHourDegrees = x * 30;
		return unadjustedHourDegrees;
	}
	
	public static int getMinuteHand(int y)
	{
		/*
		 * Returning minute hand degrees relative to 12 on the clock
		 * Clock split up into 60 units for minutes that make up one revolution (360 degrees)
		 * (y minutes/60 minutes) gives us fraction of one revolution completed
		 * (y minutes/60 minutes) * 360 degrees gives us the degree difference from 12
		 * this simplifies to y * 6
		 */
		int minuteHandAngle = y * 6;
		return minuteHandAngle;
		
	}
}
