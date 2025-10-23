package jobsheet5;
import java.util.Scanner;
public class nomer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PROGRAM SISTEM AKSES KAMPUS ===");
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartu_mahasiswa = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean sudah_registrasi_online = sc.nextBoolean();
        if (kartu_mahasiswa || sudah_registrasi_online) {
            System.out.println("Output: Boleh Masuk");
        } else {
            System.out.println("Output: Tidak boleh Masuk");
        }
        sc.close();
    }
}