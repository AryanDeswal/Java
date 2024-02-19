import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Problem 4:");
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current time: " + formattedTime);
    }
}