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
        System.out.println("\n--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa/Lainya): ");
        String jenis_pengguna = sc.nextLine();
         if (jenis_pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Output: Akses wifi dibolehkan");
            
        } else if (jenis_pengguna.equalsIgnoreCase("Mahasiswa")) {
            // Jika jenis pengguna adalah Mahasiswa
            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();
             if (sks >= 12) {
                System.out.println("Output: Akses wifi dibolehkan (Mahasiswa aktif)");
            } else {
                System.out.println("Output: Akses ditolak, SKS kurang dari 12");
            }
            
        } else {
            System.out.println("Output: Akses ditolak");
        }
        sc.close();
    }
}