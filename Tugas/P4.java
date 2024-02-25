import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}