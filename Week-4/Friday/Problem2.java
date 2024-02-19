import java.util.Date;
import java.text.SimpleDateFormat;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Problem 2:");
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(now);
        System.out.println("Current time: " + formattedTime);
    }
}