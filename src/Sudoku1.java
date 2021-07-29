public class Sudoku1 {
    public static void main(String[] args) {

        int i = 0;
        int a = 2;
        int b = 3;
        int c = 1;

        int[][] sudokuTable = {
                {1, 0, 3},
                {0, 1, 2},
                {2, 3, 0},


        };


        while (sudokuTable[0][0] + sudokuTable[0][1] + sudokuTable[0][2] != 6) {
            int szukanePole = sudokuTable[0][0];
            if (szukanePole == 0) {
                int suma = sudokuTable[0][1] + sudokuTable[0][2];
                if (suma == 3) {
                    szukanePole = 3;
                }
                if (suma == 4) {
                    szukanePole = 2;
                }
                if (suma == 5) {
                    szukanePole = 1;
                }
            }
            szukanePole = sudokuTable[0][1];
            if (szukanePole == 0) {
                int suma = sudokuTable[0][0] + sudokuTable[0][2];
                if (suma == 3) {
                    szukanePole = 3;
                }
                if (suma == 4) {
                    szukanePole = 2;
                }
                if (suma == 5) {
                    szukanePole = 1;
                }
            }
            szukanePole = sudokuTable[0][2];
            if (szukanePole == 0) {
                int suma = sudokuTable[0][0] + sudokuTable[0][1];
                if (suma == 3) {
                    szukanePole = 3;
                }
                if (suma == 4) {
                    szukanePole = 2;
                }
                if (suma == 5) {
                    szukanePole = 1;
                }
            }


        }

    }
}
//pobieram 3 wartości z pierwszego wiersza i jeśli znajduje się w nim 0, to porównuję ze sobą pozostałe wartości.
//Jeśli suma wartości wynosi 3, to przypisz 3, jeśli suma wynosi 4, to przypisz 2, jeśli suma wynosi 5, to przypisz 1
//
// PÓŹNIEJ ZROBIC GENERYCZNIE
//zobaczyć co się zmienia i zamiast tego przypisać zmienne, które później będę iterował, najpierw spróbować zmienić indeks kolumn