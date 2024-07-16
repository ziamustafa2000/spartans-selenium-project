package Code_Conquer;

import java.util.ArrayList;
import java.util.HashMap;

public class duplicateNumber {

    int[] num = {10, 5, 8, 3, 5, 6};

    public static void findDuplicates(int[] numbers, boolean print) {
        HashMap<Integer, ArrayList<Integer>> res = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (res.containsKey(numbers[i])) {
                res.get(numbers[i]).add(i);
            } else {
                res.put(numbers[i], new ArrayList<>());
                res.get(numbers[i]).add(i);
            }
        }

        if (print) {
            for (int num : res.keySet()) {
                if (res.get(num).size() > 1) {
                    System.out.println("Number: " + num + " Indices: " + res.get(num));
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] num = {10, 5, 8, 3, 5, 6};
        findDuplicates(num, true);
    }
}
