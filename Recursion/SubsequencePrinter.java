package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubsequencePrinter
{

    // Recursive function to print all subsequences of the array
    private static void printSubsequences(int[] array, int currentIndex, int[] temp, int tempIndex) {
        // Base case: If the current index is equal to the array length, print the subsequence
        if (currentIndex == array.length) {
            System.out.print("Subsequence: [");
            for (int i = 0; i < tempIndex; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println("]");
            return;
        }

        // Include the current element in the subsequence
        temp[tempIndex] = array[currentIndex];
        printSubsequences(array, currentIndex + 1, temp, tempIndex + 1);

        // Exclude the current element from the subsequence
        printSubsequences(array, currentIndex + 1, temp, tempIndex);
    }

//    HashSet <String> set
    public static void SubSequence(String str,int i,String newString,  HashSet <String> set){

//        base case
        if(i==str.length()){
//            set.add(newString);
//            System.out.println(set);
//            return;
            if(set.contains(newString)){
                return;
            }
            else {
                System.out.println("{"+newString+"}");
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(i);

//        to be
        SubSequence(str,i+1,newString+currentChar ,set);

//        not include
        SubSequence(str,i+1,newString,set);
    }
    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        printSubsequences(array, 0, new int[array.length], 0);

        HashSet<String> set = new HashSet<>();
//        ArrayList<String> List = new ArrayList<>();
        SubSequence("abac",0,"",set);
    }

}
