package matrix.util;

import matrix.Generator;
import matrix.Matrix;

/**
 * Matrix util
 */
public final class Multiplication {
    /**
     * Matrix multiplication
     *
     * @param gen which content 2 matrix
     * @return multiplication result
     */
    public static Matrix multiplicate(Generator gen) {

        Matrix matrix1 = gen.getMatrix1();
        Matrix matrix2 = gen.getMatrix2();

        Matrix resaultMatrix = new Matrix(
                matrix1.getWidth(),
                matrix2.getHeight()
        );

        int[][] content = resaultMatrix.getContent();
        int m = matrix1.getContent().length;
        int n = matrix2.getContent()[0].length;
        int o = matrix2.getContent().length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    content[i][j] += matrix1.getContent()[i][k] * matrix2.getContent()[k][j];
                }
            }
        }

        return resaultMatrix;

    }
}
