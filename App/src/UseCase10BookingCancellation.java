import java.util.*;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        Stack<String> rollback = new Stack<>();

        rollback.push("Single-1");

        System.out.println("Booking cancelled successfully");

        System.out.println("Rollback History:");
        while (!rollback.isEmpty()) {
            System.out.println(rollback.pop());
        }
    }
}