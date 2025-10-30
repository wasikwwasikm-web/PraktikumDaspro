package jobseet8;
import java.util.Scanner;
public class T3n2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = scanner.nextInt();
        
        if (n < 3) {
            System.out.println("Error: Nilai n minimal harus 3!");
            return;
        }
        
        cetakPersegiBolong(n);
        scanner.close();
    }
    
    public static void cetakPersegiBolong(int n) {
        System.out.println("Persegi bolong dengan n = " + n + ":");
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    }

