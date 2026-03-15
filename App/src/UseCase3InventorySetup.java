public class UseCase3InventorySetup {

    public static void main(String[] args){

        RoomInventory inventory = new RoomInventory();

        System.out.println("Hotel Room Inventory Status");

        System.out.println(inventory.getRoomAvailability());

    }
}