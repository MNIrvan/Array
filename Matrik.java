public class Matrik { // Membuat class Matrik

    // 1. Perkalian Matriks
    public static int[][] perkalianMatriks(int[][] matrix1, int[][] matrix2) { // mendeklarasikan fungsi perkalianMatriks dengan parameter matrix1 dan matrix2
        int rows1 = matrix1.length; // mendeklarasikan variabel rows1 dengan nilai panjang matrix1
        int cols1 = matrix1[0].length; // mendeklarasikan variabel cols1 dengan nilai panjang matrix1[0] bernilai 0
        int cols2 = matrix2[0].length; // mendeklarasikan variabel cols2 dengan nilai panjang matrix2[0] bernilai 0

        int[][] result = new int[rows1][cols2]; // mendeklarasikan variabel result dengan nilai array 2D berukuran rows1

        for (int i = 0; i < rows1; i++) { // perulangan for dengan kondisi i < rows1
            for (int j = 0; j < cols2; j++) { // perulangan for dengan kondisi j < cols2
                for (int k = 0; k < cols1; k++) { // perulangan for dengan kondisi k < cols1
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; // melakukan perkalian matriks
                }
            }
        }
        return result; // mengembalikan nilai result
    }

    public static int[][] transposeMatrix(int[][] matrix) { // mendeklarasikan fungsi transposeMatrix dengan parameter matrix
        int rows = matrix.length; // mendeklarasikan variabel rows dengan nilai panjang matrix
        int cols = matrix[0].length; // mendeklarasikan variabel cols dengan nilai panjang matrix[0] bernilai 0

        int[][] result = new int[cols][rows]; // mendeklarasikan variabel result dengan nilai array 2D berukuran cols

        for (int i = 0; i < rows; i++) { // perulangan for dengan kondisi i < rows
            for (int j = 0; j < cols; j++) { // perulangan for dengan kondisi j < cols
                result[j][i] = matrix[i][j]; // melakukan transpose matriks
            }
        }
        return result; // mengembalikan nilai result
    }

    // 3. Diagonal Utama dan Diagonal Samping
    public static void printDiagonals(int[][] matrix) { // mendeklarasikan fungsi printDiagonals dengan parameter matrix
        int n = matrix.length; // mendeklarasikan variabel n dengan nilai panjang matrix

        System.out.print("Diagonal Utama: "); // mencetak string "Diagonal Utama: "
        for (int i = 0; i < n; i++) { // perulangan for dengan kondisi i < n
            System.out.print(matrix[i][i] + " "); // mencetak nilai matrix[i][i]
        }

        System.out.print("\nDiagonal Samping: "); // mencetak string "\nDiagonal Samping: "
        for (int i = 0; i < n; i++) { // perulangan for dengan kondisi i < n
            System.out.print(matrix[i][n - 1 - i] + " "); // mencetak nilai matrix[i][n - 1 - i]
        }
        System.out.println(); // mencetak string "\n"
    }

    // Utility: Mencetak Matriks
    public static void printMatrix(int[][] matrix) { // mendeklarasikan fungsi printMatrix dengan parameter matrix
        for (int[] row : matrix) { // perulangan for-each dengan kondisi row : matrix
            for (int value : row) { // perulangan for-each dengan kondisi value : row
                System.out.print(value + " "); // mencetak nilai value
            }
            System.out.println(); // mencetak string "\n"
        }
    }

    public static void main(String[] args) { // mendeklarasikan fungsi main dengan parameter args
        int[][] matrix1 = { // mendeklarasikan variabel matrix1 dengan nilai array 2D
            {1, 2, 3}, // baris 0
            {4, 5, 6}, // baris 1
            {7, 8, 9} // baris 2
        };

        int[][] matrix2 = { // mendeklarasikan variabel matrix2 dengan nilai array 2D
            {9, 8, 7}, // baris 0
            {6, 5, 4}, // baris 1
            {3, 2, 1} // baris 2
        };

        System.out.println("Matriks 1:"); // mencetak string "Matriks 1: "
        printMatrix(matrix1); // memanggil fungsi printMatrix dengan parameter matrix1

        System.out.println("Matriks 2:"); // mencetak string "Matriks 2: "
        printMatrix(matrix2); // memanggil fungsi printMatrix dengan parameter matrix2

        // Perkalian Matriks
        int[][] product = perkalianMatriks(matrix1, matrix2); // memanggil fungsi perkalianMatriks dengan parameter matrix1 dan matrix2
        System.out.println("Hasil Perkalian Matriks:"); // mencetak string "Hasil Perkalian Matriks: "
        printMatrix(product); // memanggil fungsi printMatrix dengan parameter product

        // Transpose Matriks
        int[][] transpose = transposeMatrix(matrix1); // memanggil fungsi transposeMatrix dengan parameter matrix1
        System.out.println("Transpose Matriks 1:"); // mencetak string "Transpose Matriks 1: "
        printMatrix(transpose); // memanggil fungsi printMatrix dengan parameter transpose

        // Diagonal Utama dan Diagonal Samping
        System.out.println("Diagonal Matriks 1:"); // mencetak string "Diagonal Matriks 1: "
        printDiagonals(matrix1); // memanggil fungsi printDiagonals dengan parameter matrix1
    }
}