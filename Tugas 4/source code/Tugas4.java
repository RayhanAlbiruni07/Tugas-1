import java.util.HashMap;
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nilaiHashMap = new HashMap<String, Integer>();
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan key: ");
            String key = scanner.nextLine();
            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine();
            nilaiHashMap.put(key, nilai);
        }
        System.out.println("Isi HashMap:");
        for (String k : nilaiHashMap.keySet()) {
            System.out.println("Key: " + k + ", Nilai: " + nilaiHashMap.get(k));
        }
    }
}
