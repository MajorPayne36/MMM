package matrix;

public class Generator {
    private int m;

    private int n;

    private int k;

    Matrix matrix1;
    Matrix matrix2;

    /**
     * Generate new matrix with random size and content
     *
     * @param threadName name of current thread
     */
    public void generate(String threadName) {
        //creating matrix sizes
        m = (int) (Math.random() * 9) + 1;
        n = (int) (Math.random() * 9) + 1;
        k = (int) (Math.random() * 9) + 1;

        //Creating matrix
        matrix1 = new Matrix(m, n);
        matrix2 = new Matrix(n, k);

        System.out.println(threadName + " Matrix 1:");
        System.out.println(matrix1.toString());
        System.out.println(threadName + " Matrix 2:");
        System.out.println(matrix2.toString());
    }

    /**
     * @return first matrix
     */
    public Matrix getMatrix1() {
        return matrix1;
    }

    /**
     * @return second matrix
     */
    public Matrix getMatrix2() {
        return matrix2;
    }
}
