import java.util.*;

class Service {
    String name;
    double cost;

    Service(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        Map<String, List<Service>> services = new HashMap<>();

        services.put("Single-1", new ArrayList<>());

        services.get("Single-1").add(new Service("Breakfast", 500));
        services.get("Single-1").add(new Service("Spa", 1000));

        double total = 0;
        for (Service s : services.get("Single-1")) {
            total += s.cost;
        }

        System.out.println("Reservation ID: Single-1");
        System.out.println("Total Add-On Cost: " + total);
    }
}