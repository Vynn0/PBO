import java.util.Scanner;

class Penyewa{
    double internet, pengetikan, gameOnline, hasilBiaya;
    int scan, printWarna, printHW, tehBotol;

    Penyewa(double internet, double pengetikan, double gameOnline, int scan, int printWarna, int printHW, int tehBotol){
        this.internet = internet;
        this.pengetikan = pengetikan;
        this.gameOnline = gameOnline;
        this.scan = scan;
        this.printWarna = printWarna;
        this.printHW = printHW;
        this.tehBotol = tehBotol;
    }

    private int BiayaBarang (int jenis, int nilai) {
        return jenis * nilai;
    }

    private double BiayaPenggunaan(double jenis, double nilai, double baseline){
        if (jenis < 30 && jenis > 0) {
            return (baseline / 60) * nilai;
        } else if (jenis >= baseline) {
            return (jenis / 60) * nilai;
        } else {
            return 0;
        }
    }

    void HitungBiayaTotal(){
        // Penggunaan
        internet = BiayaPenggunaan(internet, 4000, 30);
        pengetikan = BiayaPenggunaan(pengetikan, 2000, 30);
        gameOnline = BiayaPenggunaan(gameOnline, 5000, 30);

        // Barang
        scan = BiayaBarang(scan, 1000);
        printWarna = BiayaBarang(printWarna, 500);
        printHW = BiayaBarang(printHW, 300);
        tehBotol = BiayaBarang(tehBotol, 3000);

        hasilBiaya = internet + pengetikan + gameOnline + scan + printWarna + printHW + tehBotol;
        System.out.println("Hasil biaya: Rp." + hasilBiaya);
    }
}

public class P6_Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNote: Masukkan 0 jika tidak menggunakan\n");

        System.out.print("Masukkan waktu penyewaan dalam hitungan menit dalam jenis yang tersedia (internet|pengetikan|gameonline): ");
        double internet = scanner.nextDouble();
        double pengetikan = scanner.nextDouble();
        double gameOnline = scanner.nextDouble();

        System.out.print("Anda scan berapa file?: ");
        int scan = scanner.nextInt();

        System.out.print("Anda print warna berapa lembar?: ");
        int printWarna = scanner.nextInt();

        System.out.print("Anda print black and white berapa lembar?: ");
        int printHW = scanner.nextInt();

        System.out.print("Anda mesan berapa Teh Botol?: ");
        int tehBotol = scanner.nextInt();

        Penyewa penyewa1 = new Penyewa(internet, pengetikan, gameOnline, scan, printWarna, printHW, tehBotol);
        penyewa1.HitungBiayaTotal();

        scanner.close();
    }
}
