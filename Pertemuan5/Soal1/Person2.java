abstract class Person2 {
    // Slide 5.3 ... -> 5.5 (Dimodifikasi sedikit)
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public abstract void study();
}

class Student extends Person2 {
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long, what a hard worker!");
    }
}