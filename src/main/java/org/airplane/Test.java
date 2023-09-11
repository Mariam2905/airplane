package org.airplane;

public class Test {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Flight101", 32, 'A');
        aircraft.getSeats();
        if (aircraft.reserveSeat("15D")) {
            System.out.println("Please pay for your reserved ticket. \n");
        } else {
            System.out.println("Sorry, this seat is already taken. \n");
        }
        if (aircraft.reserveSeat("15D")) {
            System.out.println("Please pay for your reserved ticket. \n");
        } else {
            System.out.println("Sorry, this seat is already taken. \n");
        }
        if (aircraft.cancelSeat("15D")) {
            System.out.println("Please contact us if you want to make a new reservation. \n");
        } else {
            System.out.println("Sorry, we couldn't find any booking for this seat. \n");
        }
        if (aircraft.cancelSeat("15D")) {
            System.out.println("Please contact us if you want to make a new reservation. \n");
        } else {
            System.out.println("Sorry, we couldn't find any booking for this seat. \n");
        }
    }
}