public class B0505 {

    // 計算 Integral Image
    public static int[][] calculateIntegralImage(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;

        int[][] integral = new int[rows][cols];

        System.out.println("計算過程：");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int top = 0;
                int left = 0;
                int topLeft = 0;

                if (i > 0) {
                    top = integral[i - 1][j];
                }

                if (j > 0) {
                    left = integral[i][j - 1];
                }

                if (i > 0 && j > 0) {
                    topLeft = integral[i - 1][j - 1];
                }

                integral[i][j] = image[i][j] + top + left - topLeft;

                System.out.println(
                        "位置 (" + i + "," + j + ") = "
                                + image[i][j] + " + " + top
                                + " + " + left + " - " + topLeft
                                + " = " + integral[i][j]);
            }
        }

        return integral;
    }

    // 印出矩陣
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] image = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("=== Assignment 2: Integral Image ===");

        System.out.println("\n原始影像矩陣：");
        printMatrix(image);

        int[][] integral = calculateIntegralImage(image);

        System.out.println("\nIntegral Image 結果：");
        printMatrix(integral);

        System.out.println("\n時間複雜度 Time Complexity：O(rows * cols)");
        System.out.println("因為每一個像素都只會被計算一次。");
    }
}