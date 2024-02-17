package Recursion;

public class CountPathMaze {
    public static int CountPath(int i, int j, int m, int n)
    {
//        boundary condition
        if(i==m || j ==n){
            return 0;
        }

//        base condition
        if (i==m-1 && j == n-1){
            return 1;
        }

//      move rightward
        int rightWard = CountPath(i,j+1,m,n);

//        move downward
        int downWard = CountPath(i+1,j,m,n);
        return rightWard+downWard;
    }

    public static void main(String[] args){
        System.out.println(CountPath(0,0,3,4));
    }
}
