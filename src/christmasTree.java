public class christmasTree {
    public static void main(String[] args) {
        char star = '*';
        int n = 3;
        int i = 1;
        int j = 0;

        while (i <= n) {

            while (j < n - 1) {
                System.out.print(" ");
                j++;
            }
            j = 1;

            while (j < (i * 2) - 1) {

                System.out.print(star);
                j++;
            }
            System.out.println(star);
            i++;

        }
    }
}

