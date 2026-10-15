// 13. Hotel Room Booking 
// • Create a Room class with fields: roomNumber, isBooked, pricePerNight, nightsBooked. 
// • Add methods: 
// o bookRoom(int nights) → set booked status and nights. 
// o calculateBill() → returns pricePerNight * nightsBooked. 
// • In main, create multiple rooms, book them, and display bills.


public class Room {
    int roomNumber;
    boolean isBooked;
    double pricePerNight;
    int nightsBooked;

    Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        this.pricePerNight = pricePerNight;
        this.nightsBooked = 0;
    }

    void bookRoom(int nights) {
        if (!isBooked && nights > 0) {
            isBooked = true;
            nightsBooked = nights;
            System.out.println("Room " + roomNumber + " successfully booked for " + nights + " nights.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked or invalid nights specified.");
        }
    }

    double calculateBill() {
        return pricePerNight * nightsBooked;
    }

    public static void main(String[] args) {
        Room[] rooms = {
            new Room(101, 100.0),
            new Room(102, 150.0),
            new Room(103, 200.0)
        };

        rooms[0].bookRoom(3);
        rooms[2].bookRoom(5);

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isBooked) {
                System.out.println("Room " + rooms[i].roomNumber + " Bill: " + rooms[i].calculateBill());
            } else {
                System.out.println("Room " + rooms[i].roomNumber + " is currently vacant.");
            }
        }
    }
}