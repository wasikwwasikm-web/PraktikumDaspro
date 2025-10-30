package jobseet8;
import java.util.Scanner;
public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, nilai;
        float totalNilai, rataNilai;
        int i = 1;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for ( j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + " adalah " + rataNilai);
            i++;
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i - 1;
            }
        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
    }
}
