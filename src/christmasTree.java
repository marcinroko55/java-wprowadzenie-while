public class christmasTree {
    public static void main(String[] args) {
        char star = '*';
        int n = 25;
        int i = 1;
        int j = 0;

        while (i <= n) {
            j = 0;
            while (j < n - i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < (i * 2) - 1) {

                System.out.print(star);
                j++;
            }
            System.out.println();
            i++;

        }
    }
}

