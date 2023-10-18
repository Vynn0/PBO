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

class Lingkaran{
    double radius;
    double area;
    final double pi = 3.14;

    Lingkaran(double radius){
        this.radius = radius;
        double diameter = Math.pow(radius, 2);
        this.area = pi * diameter;
    }

    void display(){
        System.out.println("Hasil luas lingkaran: " + area);
    }
}

public class Soal2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 0;
        while (loop == 0){
            menu();
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Masukkan alas segitiga: ");
                    int alas = scanner.nextInt();
    
                    System.out.print("Masukkan tinggi segitiga: ");
                    int tinggi = scanner.nextInt();
    
                    Segitiga segitiga = new Segitiga(alas, tinggi);
                    segitiga.display();
                    break;
                case 2:
                    System.out.print("Masukkan radius lingkaran: ");
                    int radius = scanner.nextInt();
    
                    Lingkaran lingkaran = new Lingkaran(radius);
                    lingkaran.display(); 
                    break;
                case 3:
                    loop = 1;
                    break;
                default:
                    System.out.println("Input salah, mohon ulangi lagi");
            }
        }
        scanner.close();
    }

    public static void menu(){
        System.out.println("\n== MENU ==");
        System.out.println("1. Hitung luas segitiga");
        System.out.println("2. Hitung luas lingkaran");
        System.out.println("3. Exit");
    }
}
