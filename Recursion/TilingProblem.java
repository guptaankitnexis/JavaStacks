package Recursion;

public class TilingProblem {
    public static int placeTiles(int n, int m){
//base cases
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

//        vertical
        int vertical = placeTiles(n-m,m);

//        horizontal
        int horizontal = placeTiles(n-1,m);

        return vertical+horizontal;

    }
    public static void main(String[] args){

        System.out.println(placeTiles(4,2));
    }
}
