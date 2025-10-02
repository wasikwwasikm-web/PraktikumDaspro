package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("--- Cetak KRS SIAKAD ---");
         System.out.print("Apakah UKT sudah lunas? (true/false): ");
            boolean uktLunas = sc.nextBoolean();
            if (uktLunas) {
                System.out.println("Pembayaran UKT terverifikasi");
                System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
            } else {
                System.out.println("Pembayaran UKT belum terverifikasi");
                System.out.println("Silahkan selesaikan pembayaran UKT terlebih dahulu");
            }
            String pesanTernary = uktLunas ? 
            "Pembayaran UKT tervenifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : 
            "Pembayaran UKT belum tervenifikasi\nSilahkan selesaikan pembayaran UKT terlebih dahulu";
        System.out.println(pesanTernary);
        sc.close();
    }
}


