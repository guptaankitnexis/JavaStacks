package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintSubSeqWIthSumK {

    public static void psswsk1(int[] arr,ArrayList<Integer> em,Integer i,int k)
    {
//        base case
        if(i==arr.length){
            int sum =0;
            for (int j =0;j< em.size();j++){
                sum+=em.get(j);
            }
            if(k==sum){
                System.out.println(em);
            }
            return;
        }
        em.add(arr[i]);
        psswsk(arr,em,i+1,k);
        em.remove(em.size()-1);
        psswsk(arr,em,i+1,k);
    }
//    this method will only print one subsequence
    public static boolean psswsk(int[] arr,ArrayList<Integer> em,Integer i,int k)
    {
//        base case
        if(i==arr.length){
            int sum =0;
            for (int j =0;j< em.size();j++){
                sum+=em.get(j);
            }
            if(k==sum){
                System.out.println(em);
                return true;
            }
            return false;
        }
        em.add(arr[i]);
        if (psswsk(arr,em,i+1,k)) {
            return true;
        }
        em.remove(em.size()-1);
        return psswsk(arr,em,i+1,k);
    }

//    give me count of subsequence
public static int psswsk2(int[] arr,ArrayList<Integer> em,Integer i,int k,int count)
{
    int l;
    int r;
//        base case
    if(i==arr.length)
        {
        int sum = 0;
        for (int j =0;j< em.size();j++){
            sum+=em.get(j);
        }
        if(k==sum)
        {
            count++;
            System.out.println(em);
        }
            return count;
        }
    em.add(arr[i]);
    l=psswsk2(arr,em,i+1,k,count);
    em.remove(em.size()-1);
    r=psswsk2(arr,em,i+1,k,count);
    return l+r;
}
    public static void main(String[] Args){
        ArrayList<Integer> list =new ArrayList<>();
        int[] arr={3,1,1,3,1};
        int k =3;
        System.out.println(psswsk2(arr,list,0,k,0));
    }
}
