package jobsheet9;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                        "Kentang Goreng", "Teh Tarik", "Cappucino", 
                        "Chocolate Ice"};
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Menu Kafe:");
        for (String makanan : menu) {
            System.out.println("- " + makanan);
        }
        System.out.print("\nCari makanan: ");
        String cari = input.nextLine();
        
        boolean ketemu = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(cari)) {
                ketemu = true;
                break;
            }
        }
        if (ketemu) {
            System.out.println("Makanan '" + cari + "' tersedia di menu!");
        } else {
            System.out.println("Maaf, '" + cari + "' tidak ada di menu.");
        }
        
        input.close();
    }
}