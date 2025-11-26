package pertemuan12Arry2;
import java.util.Scanner;

public class tugasA {
    public static void main(String[] args) {

        int resp = 10;
        int pert = 6;
        int[][] survey = new int[resp][pert];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < resp; i++) {
            System.out.println("\n=== Respondent " + (i + 1) + " ===");
            for (int j = 0; j < pert; j++) {
                while (true) {
                    System.out.print("Pertanyaan " + (j + 1) + " : ");
                    String line = input.nextLine();
                    try {
                        survey[i][j] = Integer.parseInt(line.trim());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid ('" + line + "'). Masukkan angka.");
                    }
                }
            }
        }
        input.close();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Data Survey yang telah diinput:");
        System.out.println("=".repeat(50));

        for (int i = 0; i < resp; i++) {
            System.out.print("Respondent " + (i + 1) + " : ");
            for (int j = 0; j < pert; j++) {
                System.out.print(survey[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Program selesai! Total input: " + (resp * pert) + " data");
        System.out.println("=".repeat(50));
    }
}
