import java.util.*;

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        Map<String, Set<String>> rooms = new HashMap<>();
        rooms.put("Single", new HashSet<>());
        rooms.put("Suite", new HashSet<>());

        allocate(rooms, "Abhi", "Single");
        allocate(rooms, "Subha", "Single");
        allocate(rooms, "Vanmathi", "Suite");
    }

    static void allocate(Map<String, Set<String>> rooms, String name, String type) {

        int id = rooms.get(type).size() + 1;
        String roomId = type + "-" + id;

        rooms.get(type).add(roomId);

        System.out.println("Booking confirmed for Guest: " + name + ", Room ID: " + roomId);
    }
}