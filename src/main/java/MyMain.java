import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counta = 0;
        int countb = 0;
        int countc = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counta++;
            }
            if (str.charAt(i) == 'b') {
                countb++;
            }
            if (str.charAt(i) == 'c') {
                countc++;
            }
        }
        return counta+countb+countc;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int the1 = str.indexOf("The");
        int the2 = str.indexOf("the");

        return ((the1 >= 0) || (the2 >= 0));
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 1; i < (str.length()/2); i++) {
            if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                continue;
            }
            else {
                return false;
            }
        }
        if (str.charAt(0) != str.charAt(str.length()-1)) {
            return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String answer = scan.nextLine();

        System.out.println("Your string countains " + countABC(answer)+ " a's, b's, or c's.");
        System.out.println(containsThe(answer));
        System.out.println(isPalindrome(answer));
    }
}
