public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        single.displayRoomDetails();
        dbl.displayRoomDetails();
        suite.displayRoomDetails();
    }
}