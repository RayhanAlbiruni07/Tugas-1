import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kampus {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.print("Masukkan NIM: ");
            String nim = bufferedReader.readLine();

            System.out.print("Masukkan Nama: ");
            String nama = bufferedReader.readLine();

            System.out.print("Masukkan Jurusan: ");
            String jurusan = bufferedReader.readLine();

            System.out.print("Masukkan Fakultas: ");
            String fakultas = bufferedReader.readLine();

            System.out.println("\nInformasi yang dimasukkan:");
            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Fakultas: " + fakultas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
