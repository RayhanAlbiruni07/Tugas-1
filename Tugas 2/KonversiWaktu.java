import java.util.Scanner;

public class KonversiWaktu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai detik: ");
        int detik = scanner.nextInt();

        int totalMenit = detik / 60;
        int menitSekarang = totalMenit % 60;

        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;

        int detikSekarang = detik % 60;

        System.out.println("Konversi Waktu : " + jamSekarang + " Jam " + menitSekarang + " Menit " + detikSekarang + " Detik");
    }
}
