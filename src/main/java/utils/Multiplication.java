package utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multiplication {
    public static Matrix multiplicate(Generator gen) {
        Matrix resultingMatrix = new Matrix(gen.matrix1.getWidth(), gen.matrix2.getHeight());

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < gen.matrix1.getWidth(); i++) {
            executorService.execute(new MatrixMultiplicate(gen.matrix1, gen.matrix2, resultingMatrix, i));
        }
        executorService.shutdown();

        return resultingMatrix;
    }
}
