package Recursion;

import java.util.HashSet;
public class SubsequenceArray
{
    public static void generateSubsequences(int[] arr, int i, StringBuilder current, HashSet<String> set)
    {
        // Base case
        if (i == arr.length) {
            String newString = current.toString();
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println("{" + newString + "}");
                set.add(newString);
                return;
            }
        }

        // Include the current element
        generateSubsequences(arr, i + 1, current.append(arr[i]), set);
        current.deleteCharAt(current.length() - 1); // Backtrack

        // Exclude the current element
        generateSubsequences(arr, i + 1, current, set);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        HashSet<String> set = new HashSet<>();
        generateSubsequences(array, 0, new StringBuilder(), set);
    }
}
