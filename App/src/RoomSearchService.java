import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room single,
            Room dbl,
            Room suite){

        Map<String,Integer> availability = inventory.getRoomAvailability();

        if(availability.get("Single")>0){
            single.displayRoomDetails();
        }

        if(availability.get("Double")>0){
            dbl.displayRoomDetails();
        }

        if(availability.get("Suite")>0){
            suite.displayRoomDetails();
        }

    }
}