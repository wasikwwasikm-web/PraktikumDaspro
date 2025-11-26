import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMHS = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahMHS][jumlahMatkul];

        for (int i = 0; i < jumlahMHS; i++) {
            System.out.print("Input nilai mahasiswa " + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(" Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            double rataRataSiswa = totalPersiswa / jumlahMatkul;
            System.out.println("Nilai rata-rata: " + rataRataSiswa);
        }
        System.out.println("=== Rata-rata Nilai setiap mata kuliah ===");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahMHS; i++) {
                totalPerMatkul += nilai[i][j];
            }
            double rataRataMatkul = totalPerMatkul / jumlahMHS;
            System.out.println("Rata-rata mata kuliah " + (j + 1) + ": " + rataRataMatkul);
        }
          sc.close();
    }
}
