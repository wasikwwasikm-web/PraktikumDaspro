package jobsheet9;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PESANAN KAFE SEDERHANA ===");
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        String[] nama = new String[jumlah];
        double[] harga = new double[jumlah];

        System.out.println("\nMasukkan detail pesanan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            
            System.out.print("Nama: ");
            nama[i] = input.nextLine();
            
            System.out.print("Harga: Rp ");
            harga[i] = input.nextDouble();
            input.nextLine();
            
            System.out.println();
        }
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += harga[i];
        }
        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Rp " + harga[i]);
        }
        System.out.println("TOTAL: Rp " + total);
        
        input.close();
    }
}