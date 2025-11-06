package jobsheet9;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        int[] nilai = new int[jumlah];
        
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("=== DAFTAR NILAI ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / jumlah;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("=== HASIL STATISTIK ===");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        input.close();
    }
}