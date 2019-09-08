package arrays;

public class AngleBetweenHourAndMinuteHand {

	public static void main(String[] args) {
		int hour = 12;
		int minute = 30;
		System.out.println(calculateAngle(hour, minute));
	}

	private static int calculateAngle(int hour, int minute) {
		if (hour == 12)
			hour = 0;
		if (minute == 60)
			minute = 0;
		int hourAngleFromTwelve = (hour*60 + minute)/2;
		int minuteAngleFromTwelve = 6 * minute;

		int angle = Math.abs(hourAngleFromTwelve - minuteAngleFromTwelve);
		return Math.min(angle, 360 - angle);

	}

}
