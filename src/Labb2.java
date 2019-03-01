
public class Labb2 {
    public static void main(String[] arg) {
        double[][] A = new double[][]{
                {4, 1, -6},
                {3, 6, 1},
                {2, 1, 3}
        };
        Func(A);

    }

    private static void Func(double[][] A) {
        double res;
        for (int i = 0; i < A.length; i++) {
            res = 0;
            for (int j = 0; j < A[i].length; j++) {
                res += A[i][j];
            }
            System.out.println("Среднее значение " + (i + 1) + " строчки = " + res / A[i].length);
        }
    }
}