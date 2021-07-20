public class triangleStars {
    public static void main(String[] args) {
        char star = '*';
        int n = 4;
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < i) {
                System.out.print(star);
                j++;
            }
            System.out.println(star);
            i++;

        }
    }
}