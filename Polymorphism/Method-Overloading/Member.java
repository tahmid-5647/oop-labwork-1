// Exercise 8: Library Member 
// Create a class Member with overloaded constructors: 
// 1. Constructor with memberId. 
// 2. Constructor with memberId and name. 
// 3. Constructor with memberId, name, and membershipType. 
// 4. Constructor with memberId, name, membershipType, and joiningDate. 

public class Member {
    String memberId;
    String name;
    String membershipType;
    String joiningDate;

    Member(String memberId) {
        this.memberId = memberId;
        this.name = "Unknown";
        this.membershipType = "Standard";
        this.joiningDate = "Not Available";
    }

    Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = "Standard";
        this.joiningDate = "Not Available";
    }

    Member(String memberId, String name, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.joiningDate = "Not Available";
    }

    Member(String memberId, String name, String membershipType, String joiningDate) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.joiningDate = joiningDate;
    }

    void displayMember() {
        System.out.println("ID: " + memberId + " | Name: " + name + " | Type: " + membershipType + " | Joined: " + joiningDate);
    }

    public static void main(String[] args) {
        Member m1 = new Member("M101");
        Member m2 = new Member("M102", "Alice");
        Member m3 = new Member("M103", "Bob", "Premium");
        Member m4 = new Member("M104", "Charlie", "VIP", "2026-10-13");

        m1.displayMember();
        m2.displayMember();
        m3.displayMember();
        m4.displayMember();
    }
}