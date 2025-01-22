public class pascle {
    public static void main(String[] args) {
        int i, j, n = 6, coef = 1;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) 
            {
                if (i == 0 || j == 0) {
                    coef = 1;
                } else {
                    coef = coef * (i - j + 1) / j;
                }

                System.out.print(" " + coef);
            }
            System.out.println();

        }

    }

}