// Exercise 10: Vowel or Consonant 
// Problem: 
// Check whether a character is a vowel or consonant. 
// Input: e 
// Output: Vowel


public class VowelConsonantChecker {
    char ch;

    VowelConsonantChecker(char ch) {
        this.ch = ch;
    }

    void checkVowelOrConsonant() {
        char lower = Character.toLowerCase(ch);
        if (lower >= 'a' && lower <= 'z') {
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not a valid letter");
        }
    }

    public static void main(String[] args) {
        VowelConsonantChecker checker = new VowelConsonantChecker('e');
        checker.checkVowelOrConsonant();
    }
}