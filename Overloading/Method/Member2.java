// Exercise 8: Library Member 
// Create a class Member with overloaded constructors: 
// 1. Constructor with memberId. 
// 2. Constructor with memberId and name. 
// 3. Constructor with memberId, name, and membershipType. 
// 4. Constructor with memberId, name, membershipType, and joiningDate. 


public class Member2 {
    String memberId;
    String name;
    String membershipType;
    String joiningDate;

    Member2(String memberId) {
        this(memberId, "Unknown", "Standard", "Not Available");
    }

    Member2(String memberId, String name) {
        this(memberId, name, "Standard", "Not Available");
    }

    Member2(String memberId, String name, String membershipType) {
        this(memberId, name, membershipType, "Not Available");
    }

    Member2(String memberId, String name, String membershipType, String joiningDate) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.joiningDate = joiningDate;
    }

    void displayMember() {
        System.out.println("ID: " + memberId + " | Name: " + name + " | Type: " + membershipType + " | Joined: " + joiningDate);
    }

    public static void main(String[] args) {
        Member2 m1 = new Member2("M101");
        Member2 m2 = new Member2("M102", "Alice");
        Member2 m3 = new Member2("M103", "Bob", "Premium");
        Member2 m4 = new Member2("M104", "Charlie", "VIP", "2026-10-13");

        m1.displayMember();
        m2.displayMember();
        m3.displayMember();
        m4.displayMember();
    }
}