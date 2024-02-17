package Recursion;

public class FriendsPairingProblem {
    public static int friendPair(int n){

//        base case
        if(n<=1){
            return 1;
        }
//        if(n==2){
//            return 2;
//        }

//        call a single person
        int single = friendPair(n-1);

//        call firstly a pair
        int pair = (n-1)*friendPair(n-2);

        return single+pair;
    }

    public static void main(String[] args){
        System.out.println(friendPair(4));
    }
}
