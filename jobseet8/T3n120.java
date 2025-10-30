package jobseet8;
import java.util.Scanner;
public class T3n120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        if (n < 1 || n > 5) {
            System.out.println("Error: n harus antara 1 dan 5");
            return;
        }
        for (n = 1; n <= 5; n++) {
            int total = 0;
            String detail = "";
            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                total += kuadrat;
                 if (i == 1) {
                    detail += kuadrat + "";
                } else {
                    detail += " + " + kuadrat;
                }
            }
            System.out.println("n = " + n + " -> jumlah kuadrat = " + detail + " = " + total);
        }
    }
}
