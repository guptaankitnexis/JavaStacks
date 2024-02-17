package Basics;

public class MyStringBuilder {
    public static void swap(StringBuilder ch,int i , int n){
        char temp = ch.charAt(i);
        ch.setCharAt(i,ch.charAt(n-1-i));
        ch.setCharAt(n-1-i,temp);
    }
    public static StringBuilder reverseString(StringBuilder st)
    {
        int n = st.length();
        for (int i=0 ; i < n/2;i++)
        {
            swap(st,i,n);
        }
        return st;
    }
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));
//         System.out.println(sb[0]);
//        above line in not working

//        set character at index 0  (replace at chat method)
        sb.setCharAt(0,'h');
        System.out.println(sb);

//        insert method
        sb.insert(2,'N');
        System.out.println(sb);

//        delete the extra(last index in non exclusive)
        sb.delete(2,3);
        System.out.println(sb);

        //        append method
        StringBuilder s = new StringBuilder("h");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("ooo");
//        s.append("!");
        System.out.println(s);

//length method
        System.out.println(sb.length());

//reverse strings
        System.out.println(reverseString(s));

        StringBuilder row = new StringBuilder();
        row.append("abc"); // Use append to add characters to the StringBuilder

// Alternatively, if you want to completely replace the content of the StringBuilder
        row = new StringBuilder("abcdef");

// Or using toString
//        row = new StringBuilder("abc");
        String result = row.toString(); // result will be "abc"
        System.out.println(result);

    }


}
