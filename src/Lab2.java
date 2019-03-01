public class Lab2 {
    public static void main(String[] arg) {
        double n = 3, m = 3;
        double a = 3;
        double[][] B = new double[][]{
                {4, 1, -6},
                {3, 6, 1},
                {2, 1, 3}
        };
        Func(a, B, n, m);

    }

    private static void Func(double a, double[][] A, double n, double m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a * A[i][j] + " ");
            }
            System.out.println();
        }
    }
}


