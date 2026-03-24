class InvalidBookingException extends Exception {
    public InvalidBookingException(String msg) {
        super(msg);
    }
}

public class UseCase9ErrorHandlingValidation {

    static void validate(String roomType) throws InvalidBookingException {
        if (!roomType.equals("Single") && !roomType.equals("Double")) {
            throw new InvalidBookingException("Invalid Room Type");
        }
    }

    public static void main(String[] args) {

        try {
            validate("Suite");
        } catch (InvalidBookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}