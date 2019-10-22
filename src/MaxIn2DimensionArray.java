import java.util.Scanner;

public class MaxIn2DimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix row number: ");
        int row = sc.nextInt();
        System.out.println("Enter matrix column number: ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter number at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix : ");
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+" ");
                if(max < matrix[i][j]) max = matrix[i][j];
            }
        }
        System.out.println();
        System.out.println("Max value in the array : "+max);
    }
}
