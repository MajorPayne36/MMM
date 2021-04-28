package utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This utility class allows to multiply two matrices using multiple threads.
 * To keep mathematical notation, matrices are denoted as "A" and "B"
 *
 * @author Mikhail Savin
 */
public class MatrixMultiplicate implements Runnable {
    private static final Logger LOG = LogManager.getLogger();

    private Matrix A;
    private Matrix B;
    private final int threadNumber;
    private Matrix resultingMatrix;

    public MatrixMultiplicate(Matrix A, Matrix B, Matrix resultingMatrix, int threadNumber) {
        this.A = A;
        this.B = B;
        this.resultingMatrix = resultingMatrix;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        if (A.getHeight() == B.getWidth()) {
            for (int i = 0; i < A.getHeight(); i++) {
                resultingMatrix.getContent()[threadNumber][i] = 0;
                for (int j = 0; j < B.getWidth(); j++) {
                    resultingMatrix.getContent()[threadNumber][i] +=
                            A.getContent()[threadNumber][j] * B.getContent()[j][i];
                }
            }
        } else {
            LOG.error("Multiplication error. Anything went wrong");
        }
    }
}