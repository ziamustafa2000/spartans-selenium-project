package Code_Conquer;

public class findTheNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        boolean found = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] + numbers[i - 1] == target) {
                System.out.println(numbers[i - 1] + " + " + numbers[i] + " = " + target);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No consecutive numbers found that add up to " + target);
        }
    }
}
