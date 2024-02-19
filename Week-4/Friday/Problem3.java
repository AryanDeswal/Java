import java.util.Calendar;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Problem 3:");
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        String formattedHour = String.format("%02d", hour);
        String formattedMinute = String.format("%02d", minute);
        String formattedSecond = String.format("%02d", second);

        System.out.println("Current time: " + formattedHour + ":" + formattedMinute + ":" + formattedSecond);
    }
}