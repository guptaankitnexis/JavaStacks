package Recursion;

import java.util.ArrayList;

public class SubsetsOfSets {

    public static void findSubset(ArrayList<Integer> set,int n){

        if(n==0){
            System.out.println(set);
            return;
        }
        set.add(n);
        findSubset(set,n-1);

        set.remove(set.size()-1);
        findSubset(set,n-1);

    }
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        int n =3;
        findSubset(list,n);

    }
}
