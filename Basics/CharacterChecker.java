// Exercise 9: Character Type Checker 
// Problem: 
// Check if a character is a letter, digit, or special character. 
// Input: @ 
// Output: Special character



public class CharacterChecker {
    char ch;

    CharacterChecker(char ch) {
        this.ch = ch;
    }

    void checkCharacterType() {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }

    public static void main(String[] args) {
        CharacterChecker checker = new CharacterChecker('@');
        checker.checkCharacterType();
    }
}