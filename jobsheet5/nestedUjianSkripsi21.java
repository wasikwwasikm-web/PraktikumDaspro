package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebaskompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
         if (bebaskompen.equalsIgnoreCase("Ya")) {
              if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi.Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal log bimbingan P1 kurang dari 8 dan log bimbingan Pembimbing 2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal log bimbingan Pembimbing 1 kurang dari 8 kali";
            } else {
                pesan = "Gagal log bimbingan Pembimbing 2 kurang dari 4 kali";
            }
        } else {
            pesan = "Gagal, mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
    }
    
