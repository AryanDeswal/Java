public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Problem 3:");
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        System.out.println(thread1.getName() + " default priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " default priority: " + thread2.getPriority());

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(thread1.getName() + " new priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " new priority: " + thread2.getPriority());

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        }
    }
}
