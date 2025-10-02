package jobsheet5;
import java.util.Scanner;
public class nomer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = sc.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan GENAP");
        } else {
            System.out.println(bilangan + " adalah bilangan GANJIL");
        }
        sc.close();
    }
    }

