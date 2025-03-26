import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];
        
        // Input matrices
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Choose an operation: ");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Matrix Transpose (Matrix 1)");
        System.out.println("4. Matrix Transpose (Matrix 2)");

        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                // Matrix Addition
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Matrix Addition result:");
                break;

            case 2:
                // Matrix Multiplication
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                    }
                }
                System.out.println("Matrix Multiplication result:");
                break;

            case 3:
                // Matrix Transpose (Matrix 1)
                System.out.println("Matrix 1 Transpose:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrix1[j][i] + " ");
                    }
                    System.out.println();
                }
                return;

            case 4:
                // Matrix Transpose (Matrix 2)
                System.out.println("Matrix 2 Transpose:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrix2[j][i] + " ");
                    }
                    System.out.println();
                }
                return;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Displaying result
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
}
}