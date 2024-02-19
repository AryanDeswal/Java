class welcomeThread extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}

class goodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Problem 2:");
        welcomeThread t1 = new welcomeThread();
        goodMorningThread t2 = new goodMorningThread();
        t1.start();
        t2.start();
    }
}