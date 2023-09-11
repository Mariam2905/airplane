package org.airplane;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private final String airCraftName;
    private List<Seat> seats = new ArrayList<>();


    public Aircraft(String airCraftName, int numRows, char seatsPerRow) {
        this.airCraftName = airCraftName;
        int lastSeat = 'A' + (seatsPerRow - 1);
        for (int rowNum = 1; rowNum <= numRows; rowNum++) {
            for (char seatNum = 'A'; seatNum <= lastSeat; seatNum++) {
                Seat seat = new Seat(String.format("%02d", rowNum) + seatNum);
                seats.add(seat);
            }
        }
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    /**
     * This method makes it possible to reserve a seat.
     *
     * @param seatNumber;
     * @return requestedSeat.reserve();
     */
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return true;
        }
        return requestedSeat.reserve();
    }

    /**
     * This method makes it possible to cancel a seat.
     *
     * @param seatNumber;
     * @return cancelRequestedSeat.cancel();
     */
    public boolean cancelSeat(String seatNumber) {
        Seat cancelRequestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                cancelRequestedSeat = seat;
                break;
            }
        }
        if (cancelRequestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return cancelRequestedSeat.cancel();
    }
}