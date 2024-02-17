package Recursion;

import java.util.*;
public class PrintKeypadCombination {
    public static String[] Keypad = {".","abc","def","ghi","jkl","mno","pgrs","tu","vwx","yz"};
//    public static String getDataType(Object variable) {
//        return variable.getClass().getSimpleName();
//    }
    public static void PrintKeypadComb(String num,int ind,String combination){
//        base case
        if(ind==num.length()){
        System.out.println(combination);
        return;
}
        String keypad = Keypad[num.charAt(ind)-'0'];
//        System.out.println(getDataType(keypad));
        for(int i =0;i<keypad.length();i++){
            PrintKeypadComb(num,ind+1,combination+ keypad.charAt(i));
        }
    }

    public static void main(String[] args){
        PrintKeypadComb("9",0,"");
    }
}
