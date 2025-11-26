package pertemuan12Arry2;
import java.util.Scanner;

public class tugasC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah responden
        System.out.print("Masukkan jumlah responden: ");
        int jumlahResponden = scanner.nextInt();

        // Input jumlah pertanyaan
        System.out.print("Masukkan jumlah pertanyaan: ");
        int jumlahPertanyaan = scanner.nextInt();

        // Deklarasi array untuk menyimpan data survei
        int[][] surveyData = new int[jumlahResponden][jumlahPertanyaan];

        // Input data survei
        System.out.println("\nMasukkan data survei:");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                surveyData[i][j] = scanner.nextInt();
            }
        }

        // Proses perhitungan rata-rata untuk setiap pertanyaan
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int total = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                total += surveyData[i][j];
            }

            double rata = (double) total / jumlahResponden;

            System.out.println("Rata-rata pertanyaan " + (j + 1) + ": " + rata);
        }

        scanner.close();
    }
}
