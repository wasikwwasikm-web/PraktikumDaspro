package pertemuan12Arry2;

import java.util.Scanner;

public class tugasB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rata;
        int i = 0;

        System.out.print("Masukkan jumlah responden: ");
        int jumlahResponden = scanner.nextInt();

        System.out.print("Masukkan jumlah pertanyaan: ");
        int jumlahPertanyaan = scanner.nextInt();

        int[][] resp = new int[jumlahResponden][jumlahPertanyaan];

        for (int k = 0; k < jumlahResponden; k++) {
            System.out.println("Responden " + (k + 1) + ":");
            for (int l = 0; l < jumlahPertanyaan; l++) {
                System.out.print("  Pertanyaan " + (l + 1) + ": ");
                resp[k][l] = scanner.nextInt();
            }
        }
        while (i < jumlahResponden) {
            int total = 0;
            int j = 0;

            while (j < jumlahPertanyaan) {
                total += resp[i][j];
                j++;
            }

            rata = (double) total / jumlahPertanyaan;
            System.out.println("Rata-rata resp " + (i + 1) + ": " + rata);

            i++;
        }

        scanner.close();
    }
}
