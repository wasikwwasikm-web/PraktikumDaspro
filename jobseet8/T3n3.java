package jobseet8;
import java.util.Scanner;
public class T3n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah cabang coffe : ");
        int jumlahCabang = scanner.nextInt();
        System.out.println();

        int [] totalPelangganPerCabang = new int[jumlahCabang];
        int [] totalItemPerCabang = new int[jumlahCabang];
        int totalSemuaPelanggan = 0;
        int totalSemuaItem = 0;

        for (int cabang = 0; cabang < jumlahCabang; cabang++) {
            System.out.print("--- Cabang "+ (cabang + 1) + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = scanner.nextInt();
            totalPelangganPerCabang[cabang] = jumlahPelanggan;
            int totalItemCabang = 0;

            for (int pelanggan = 0; pelanggan < jumlahPelanggan; pelanggan++) {
                System.out.print("Pelanggan "+ (pelanggan + 1) + " memesan berapa item? ");
                int jumlahItem = scanner.nextInt();
                totalItemCabang += jumlahItem;
            }
            System.out.print("Cabang " + (cabang + 1) + ":");
            System.out.println("- Pelanggan:  " +  jumlahPelanggan + "orang");
            System.out.println("- Item terjual: " + totalItemCabang);
            System.out.println();
            totalSemuaPelanggan += jumlahPelanggan;
            totalSemuaItem += totalItemCabang;
        }
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalSemuaPelanggan + " orang");
        System.out.println("Item terjual: " + totalSemuaItem + " item");
        scanner.close();
    }
}
