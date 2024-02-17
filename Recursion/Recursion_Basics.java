package Recursion;

public class Recursion_Basics {
//    5 to 1
    public static void reoccur(int n){
        if(n==0)
            return;
        System.out.println(n);
        reoccur(n-1);
    }
//    1 to 5
    public static void reoccur1(int n){
        if(n==0) {
            return;
        }

        reoccur1(n-1);
        System.out.println(n);
    }
    public static void ParameterisedSum(int i,int sum,int n)
    {

        if(i>n){
            System.out.println(sum);
            return ;
        }
        ParameterisedSum(i+1,sum+i,n);
    }

    public static int FunctionalSum(int n)
    {

        if(n==0){
            return 0;
        }
        return n+FunctionalSum(n-1);
    }
    public static void callName(String name,int n){
        if (n==0){
            return;
        }
        System.out.println(name);
        callName(name, n-1);
    }

    public static void ParaFact(int n, int pro){
        if(n==0 || n ==1){
            System.out.println(pro);
            return ;
        }
        ParaFact(n-1,n*pro);
//        System.out.println(n+"," +pro);
    }


    public static int FuncFact(int n){
        if(n==0 || n ==1){
            return 1;
        }
        return n*FuncFact(n-1);
    }

    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int first = Fibonacci(n-1);
        int last = Fibonacci(n-2);
//        System.out.println(first+last);
        return first+last;
    }
    public static void main(String[] args){
//        reoccur1(5);

//        int n =5;
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        callName(name ,n);


//        System.out.println(FunctionalSum(5));
//        ParameterisedSum(0,0,5);

//        ParaFact(5,1);
//        System.out.println(FuncFact(0));

        System.out.println(Fibonacci(7));
    }
}
