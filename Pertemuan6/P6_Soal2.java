import java.util.Scanner;

class Phonecall{
    int jam, menit, detik, biaya, totalDetik, totalDetikAkhir, intervalWaktu;

    Phonecall(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
        totalDetik = (jam * 60 + menit) * 60 + detik; // Kalkulasi total detik
    }

    void WaktuSelesai(int jam_akhir, int menit_akhir, int detik_akhir){
        totalDetikAkhir = (jam_akhir * 60 + menit_akhir) * 60 + detik_akhir;
        intervalWaktu = (totalDetikAkhir - totalDetik); // Mencari interval waktu dengan detik

        jam_akhir = intervalWaktu / 3600;
        int remain = intervalWaktu % 3600;
        menit_akhir = remain / 60;
        detik_akhir = remain % 60;

        System.out.println("\nLama waktu percakapan: ");
        System.out.println("Jam: " + jam_akhir + "| Menit: " + menit_akhir + "| Detik: " + detik_akhir);
    }

    void HasilBiaya(){
        biaya = (150 / 5) * totalDetik;
        System.out.println("\nTotal biaya: Rp." + biaya);
    }
}

public class P6_Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu awal percakapan (JAM MENIT DETIK): ");
        int jam = scanner.nextInt();
        int menit = scanner.nextInt();
        int detik = scanner.nextInt();

        Phonecall call1 = new Phonecall(jam, menit, detik);

        System.out.print("\nMasukkan waktu akhir percakapan (JAM MENIT DETIK): ");
        int jam_akhir = scanner.nextInt();
        int menit_akhir = scanner.nextInt();
        int detik_akhir = scanner.nextInt();

        call1.WaktuSelesai(jam_akhir, menit_akhir, detik_akhir);

        call1.HasilBiaya();

        scanner.close();
    }
}
