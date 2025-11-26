
import java.util.Scanner;

public class BioskopWithScanner20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Andi";
        penonton[1][1] = "Budi";

        System.out.println("=== DAFTAR PENONTON ===");
        for(int i=0; i<4; i++) {
            for(int j=0; j<2; j++) {
                String tampilan = (penonton[i][j] == null) ? "***" : penonton[i][j];
                System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + tampilan);
            }
        }
        sc.close();

    }
}
