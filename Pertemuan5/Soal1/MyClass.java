public class MyClass{
    // Slide 5.2, ... -> 5.5, Pertemuan 5, PBO

    int x; // Attribute
    int y = 3;
    final double PI = 3.14; // CANNOT BE MODIFIED

    static void myMethod(){ // Method

    }

    public MyClass() { // Constructor
        x = 5;
    }
    public static void main(String[] args) {
        MyClass myObj1 = new MyClass(); // Object 1
        MyClass myObj2 = new MyClass(); // Object 2

        myObj1.x = 25; // Attributes modification

        System.out.println(myObj1.x); // Call myObj1, and print x
        System.out.println(myObj2.x);
    }
}