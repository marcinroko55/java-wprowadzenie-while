public class Sudoku1 {
    public static void main(String[] args) {

        int i = 0;
        int[][] sudokuTable = {
                {1, 0, 3},
                {0, 1, 2},
                {2, 3, 0},
        };

        while (i < sudokuTable.length) {
            int j = 0;
            while (j < sudokuTable.length) {
                if (sudokuTable[i][j] == 0) {
                    int kolejnyKolejny = (j + 2) % (sudokuTable.length);
                    int kolejny = (j + 1) % (sudokuTable.length);
                    int suma = sudokuTable[i][kolejny] + sudokuTable[i][kolejnyKolejny];
                    if (suma == 3) {
                        sudokuTable[i][j] = 3;
                    }
                    if (suma == 4) {
                        sudokuTable[i][j] = 2;
                    }
                    if (suma == 5) {
                        sudokuTable[i][j] = 1;
                    }
                }
                System.out.print(sudokuTable[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

