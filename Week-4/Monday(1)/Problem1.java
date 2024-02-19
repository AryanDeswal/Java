class welcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

class goodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Problem 1:");
        welcomeThread t1 = new welcomeThread();
        goodMorningThread t2 = new goodMorningThread();
        t1.start();
        t2.start();
    }
}
