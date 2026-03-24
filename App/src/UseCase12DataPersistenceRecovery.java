import java.io.*;
import java.util.*;

class RoomInventory {
    Map<String, Integer> rooms = new HashMap<>();

    RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }
}

class FilePersistenceService {

    public void saveInventory(RoomInventory inventory, String filePath) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {

            for (Map.Entry<String, Integer> entry : inventory.rooms.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }

            System.out.println("Inventory saved successfully.");

        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }

    public void loadInventory(RoomInventory inventory, String filePath) {

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("No valid inventory data found. Starting fresh.");
            return;
        }

        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(":");
                inventory.rooms.put(parts[0], Integer.parseInt(parts[1]));
            }

            System.out.println("Inventory loaded successfully.");

        } catch (Exception e) {
            System.out.println("Error loading file.");
        }
    }
}

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService service = new FilePersistenceService();

        String filePath = "inventory.txt";

        System.out.println("System Recovery");

        service.loadInventory(inventory, filePath);

        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.rooms.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        service.saveInventory(inventory, filePath);
    }
}
