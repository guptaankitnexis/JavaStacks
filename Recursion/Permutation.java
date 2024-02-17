package Recursion;

import java.util.*;

public class Permutation {
    public static void Perm(StringBuilder str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
//            ans + str.charAt(i);
//            ans.append(str.charAt(i));

            // Create a new StringBuilder for each recursive call
            StringBuilder em = new StringBuilder(str);
            em.delete(i, i + 1);

            Perm(em, ans+str.charAt(i));

            // Backtrack to the previous state by removing the last character
//            ans.deleteCharAt(ans.length() - 1);
        }
    }



    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
//        StringBuilder ans = new StringBuilder();
//        char ans ;
        Perm(str, "");
    }
}
