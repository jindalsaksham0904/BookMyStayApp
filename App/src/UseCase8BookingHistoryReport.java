import java.util.*;

class Reservation {
    String guest;
    String roomType;

    Reservation(String guest, String roomType) {
        this.guest = guest;
        this.roomType = roomType;
    }
}

public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        List<Reservation> history = new ArrayList<>();

        history.add(new Reservation("Abhi", "Single"));
        history.add(new Reservation("Subha", "Double"));
        history.add(new Reservation("Vanmathi", "Suite"));

        System.out.println("Booking History Report");

        for (Reservation r : history) {
            System.out.println("Guest: " + r.guest + ", Room Type: " + r.roomType);
        }
    }
}