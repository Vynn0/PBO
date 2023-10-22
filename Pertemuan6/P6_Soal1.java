import java.util.Scanner;

class Segitiga{
    double alas;
    double tinggi;
    double luas;

    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = 0.5 * alas * tinggi;
    }

    void display(){
        System.out.println("Hasil luas segitiga: " + luas);
    }
}

public class P6_Soal1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int alas = scanner.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        Segitiga segitiga = new Segitiga(alas, tinggi);
        segitiga.display();

        scanner.close();
    }
}
