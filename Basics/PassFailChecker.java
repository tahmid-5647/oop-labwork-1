// Exercise 13: Pass or Fail 
// Problem: 
// Check if the score is at least 33 to pass. 
// Input: 30 
// Output: Fail


public class PassFailChecker {
    int score;

    PassFailChecker(int score) {
        this.score = score;
    }

    void checkPassFail() {
        if (score >= 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        PassFailChecker checker = new PassFailChecker(30);
        checker.checkPassFail();
    }
}