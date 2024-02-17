package OOPS;

class Pen{
    String color;
    String type ;// ballpoint,gel
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("constructor called");
    }
//    Student(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }

}
public class oops {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";
//        System.out.println(pen1.color);
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen1.printColor();
        pen2.printColor();

        //parameterised constructor
        Student s1 = new Student(); // new keyword will crete a memory in heap to store whole object
        s1.name= "Shinchan";
        s1.age = 5;

        //copy construtor calling
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
