package Que1;

public class que1 {
	static String firstName = "Shubham";
    static String lastName = "Kumar";
    static int age = 24;
    private static void print(){
        System.out.println("In static method");
        System.out.println("Shubham Kumar 24");
    }
    static {
        System.out.println("In static block");
        System.out.println("Shubham Kumar 24");
    }
    
    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(firstName + " " + lastName + " " + age);
        print();
    }
}
