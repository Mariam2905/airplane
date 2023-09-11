package org.airplane;

public class Seat {
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * This method does not allow reserving an already reserved seat.
     *
     * @return if it is possible;
     */
    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " is now reserved.");
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method cancel a reserved seat.
     *
     * @return if it is possible;
     */
    public boolean cancel() {
        if (this.reserved) {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " has now been cancelled");
            return true;
        } else {
            return false;
        }
    }
}
