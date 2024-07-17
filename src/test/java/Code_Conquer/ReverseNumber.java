package Code_Conquer;
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // original number
        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10; // extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // append the digit
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}