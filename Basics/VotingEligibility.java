// Exercise 15: Eligibility for Voting 
// Problem: 
// Check if a person is eligible to vote (age ≥ 18). 
// Input: 17 
// Output: Not eligible to vote


public class VotingEligibility {
    int age;

    VotingEligibility(int age) {
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        VotingEligibility checker = new VotingEligibility(17);
        checker.checkEligibility();
    }
}