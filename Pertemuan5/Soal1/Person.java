public class Person {
    // Slide 5.3 (Dimodifikasi sedikit)
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args) {
        Person objPerson = new Person();
        System.out.println("Name: " + objPerson.fname + " " + objPerson.lname);
        System.out.println("Age: " + objPerson.age);
    }
}
