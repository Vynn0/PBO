// Person digabung dengan MyClass.
class MyClass2 {
    public static void main(String[] args) {
        Student objPerson = new Student();
        System.out.println("Name: " + objPerson.fname + " " + objPerson.lname);
        System.out.println("Age: " + objPerson.age);
        System.out.println("Graduation Year: " + objPerson.graduationYear);
        objPerson.study();
    }
}