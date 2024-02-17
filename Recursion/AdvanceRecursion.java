package Recursion;

import java.util.Arrays;

public class AdvanceRecursion {
    public static void CalPower(int x, int n,int pow){
        if(x==0){
            return;
        }
        if (n==0){
            System.out.println(pow);
            return;
        }
        CalPower(x,n-1,x*pow);

    }
    public static int FunCalPower(int x, int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        return x*FunCalPower(x,n-1);

    }

    public static int power(int x, int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        int val = power(x,n/2);
        if (n%2==0){
//            System.out.println(val*val);
            return val*val;
        }else {
//            System.out.println(val * val * x);
            return val * val * x;
        }
    }


    public static int first =-1;
    public static int last =-1;
    public static void occur(String str, char element,int n){

//        base case
        if (n==0){
            System.out.println(first+","+last);
            return;
        }
//       logic
        if (str.charAt(n)==element)
        {
            if(last==-1){
                last = n;
            }
            else {
                first=n;
            }
        }
//        recurrence call
        occur(str,element,n-1);
    }


    public static void CheckIfSorted(int []arr,int i,int n){
//        base case
        if(i==n-1){
            System.out.println("Yes array is sorted!");
            return;
        }
        if(arr[i]>=arr[i+1]){
            System.out.println("No array is not sorted/strickly sorted");
        }
        else{
            CheckIfSorted(arr,i+1,n);
        }
    }


    public static int MoveX1(StringBuilder str,StringBuilder st ,int i,int count) {
        // base case
        if (i == str.length()) {
            return count;
        }
        // logic
        if(str.charAt(i)=='x'){
            count++;
        }
        else{
            st.append(str.charAt(i));
        }
        return MoveX(str, st,i + 1, count);
    }

    public static StringBuilder moveXToEnd(StringBuilder str, int i, int n) {
        // Base case
        if (i == n) {
            return str;
        }

        // Move 'x' characters to the end
        if (str.charAt(i) == 'x') {
            str.append('x'); // Append 'x' at the end
            str.deleteCharAt(i); // Remove 'x' from the current position
        }

        // Recursive call
        return moveXToEnd(str, i + 1, n);
    }

    public static int MoveX(StringBuilder str, StringBuilder st, int i, int count) {
        // base case
        if (i == str.length()) {
            return count;
        }
        // logic
        if (str.charAt(i) == 'x') {
            count++;
        } else {
            st.append(str.charAt(i));
        }
        // Recursive call with count update
        count = MoveX(str, st, i + 1, count);
        return count;
    }

    public static void RemoveDuplicates(String str,String em,boolean []Array,int i){
//        base case
        if(i==str.length()){
            System.out.println(em);
            return;
        }
//        logic
        if(!(Array[str.charAt(i)-'a'])){
            em+=str.charAt(i);
            Array[str.charAt(i)-'a']=true;
        }
        RemoveDuplicates(str,em,Array,i+1);
    }



    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("xasdihdissxdxhuhxjhuxfjjhxxxj");
//        StringBuilder st = new StringBuilder();
//        int count = 0;
//
//        count = MoveX(str, st, 0, count);
//        System.out.println(count);
//
//        for (int j = 0; j < count; j++) {
//            st.append('x');
//        }
//
//        System.out.println(st);

        boolean[] Array =new boolean[26];
        Arrays.fill(Array, false);
        RemoveDuplicates("aabbccddeeff","",Array,0);
    }

//        System.out.println(moveXToEnd(str, 0, str.length()));
//        CalPower(5,3,1);
//        System.out.println(FunCalPower(12,3));
//        System.out.println(power(2,10));

//        String str ="bahajad";
//        int n = str.length()-1;
//        occur(str,'a',n);

//        int [] num ={1,2,3,6,5};
//        int n = num.length;
//        CheckIfSorted(num,0,n);

}