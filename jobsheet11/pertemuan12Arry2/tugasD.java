package pertemuan12Arry2;

public class tugasD {


    public static int[][] survey() {

        int[][] dataSurvey = {
            {4, 5, 3, 4, 5, 4},
            {5, 4, 5, 3, 4, 5},
            {3, 4, 4, 5, 3, 4},
            {4, 3, 5, 4, 5, 3},
            {5, 5, 4, 3, 4, 5},
            {4, 4, 3, 5, 4, 4},
            {3, 5, 4, 4, 3, 5},
            {5, 4, 5, 5, 4, 4},
            {4, 3, 4, 4, 5, 3},
            {3, 4, 5, 3, 4, 5}
        };
        return dataSurvey;
    }

    public static void main(String[] args) {
        double totalSemua = 0;
        int[][] resp = survey();

        for (int i = 0; i < resp.length; i++) {
            int total = 0;

            for (int j = 0; j < resp[i].length; j++) {
                total += resp[i][j];
            }

            totalSemua += total;
        }
        double rataSemua = (double) totalSemua / (10 * 6);

        System.out.println("Rata-rata seminar: " + rataSemua);
    }
}
