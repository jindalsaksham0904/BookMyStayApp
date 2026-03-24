class BookingTask implements Runnable {

    static int rooms = 2;

    public synchronized void book(String name) {
        if (rooms > 0) {
            System.out.println("Booking confirmed for " + name);
            rooms--;
        } else {
            System.out.println("No rooms available for " + name);
        }
    }

    public void run() {
        book(Thread.currentThread().getName());
    }
}

public class UseCase11ConcurrentBookingSimulation {

    public static void main(String[] args) {

        BookingTask task = new BookingTask();

        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");
        Thread t3 = new Thread(task, "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}