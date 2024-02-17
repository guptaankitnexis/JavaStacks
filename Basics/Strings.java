import java.util.*;
public class Strings {
    public static void main(String[] args)
    {
//        string declaration
        String name="Tony";
        System.out.println(name);
//        String fullName = "Tony Stark";
//        String sentence = "MY name is Tony Stark";
//        System.out.println(name);
//        System.out.println(fullName);
//        System.out.println(sentence);

//        Scanner sc = new Scanner (System.in);
//        String name = sc.nextLine();
//        System.out.println(name);


//        concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


//        length of String
        System.out.println(fullName.length());

//        charAt
        for (int i =0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

//          compare first character ascii value
//        s1 < s2 : positive value
//        s1 == s2 : 0
//        s1 > s2 : negative value
//        Comparision
        String name1="Tony";
        String name2="Tony";
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

//       == fails many times
        if(name1 == name2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
//case failed because java mein strings object hoti hai
        if(new String("Tony") == new String ("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

//        substring  (begining index[including], ending index[not including])
//        it takes automatically ending index by default if not provided
        String sentence ="My name is ankit";
        String name123 = sentence.substring(3 , sentence.length());
        System.out.println(name);


        String str = "ha ";
        str = "idid";
        System.out.println(str);
//        int number
//                = Integer. parselnt (str) ;
//        System. out. println (number) ;
//     -----------strings are  ot immutable-----------
    }
}
