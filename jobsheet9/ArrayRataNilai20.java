package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        double totalLulus = 0;
        double totalTidakLulus = 0;
        double total = 0;
        double rata2;
        int jumlahLulus= 0;
        int jumlahTidakLulus= 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+" : ");
            nilaiMhs[i] = sc.nextInt(); 
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }else{
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        double rataLulus = 0;
        double rataTidakLulus =0;

        if (jumlahLulus > 0) {
            rataLulus = totalLulus/jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus/jumlahTidakLulus;
        }
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
