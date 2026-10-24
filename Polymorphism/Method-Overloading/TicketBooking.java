// Exercise 7: Ticket Booking System 
// Create a class TicketBooking with overloaded bookTicket: 
// 1. Accepts only name → default economy class. 
// 2. Accepts name and seat type (Economy/Business). 
// 3. Accepts name, seat type, and meal preference. 
// 4. Accepts name, seat type, meal preference, and number of tickets.


public class TicketBooking {
    void bookTicket(String name) {
        System.out.println("Name: " + name + " | Seat Type: Economy | Meal: None | Tickets: 1");
    }

    void bookTicket(String name, String seatType) {
        System.out.println("Name: " + name + " | Seat Type: " + seatType + " | Meal: None | Tickets: 1");
    }

    void bookTicket(String name, String seatType, String mealPreference) {
        System.out.println("Name: " + name + " | Seat Type: " + seatType + " | Meal: " + mealPreference + " | Tickets: 1");
    }

    void bookTicket(String name, String seatType, String mealPreference, int numberOfTickets) {
        System.out.println("Name: " + name + " | Seat Type: " + seatType + " | Meal: " + mealPreference + " | Tickets: " + numberOfTickets);
    }

    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        booking.bookTicket("Alice");
        booking.bookTicket("Bob", "Business");
        booking.bookTicket("Charlie", "Business", "Vegetarian");
        booking.bookTicket("David", "Economy", "Standard", 4);
    }
}