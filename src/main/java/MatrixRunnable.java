import matrix.Generator;
import matrix.Matrix;
import matrix.util.Multiplication;

class MatrixRunnable implements Runnable {
    synchronized public void run() {
        //Generate few matrix with random content and sizes
        Generator gen = new Generator();
        gen.generate(Thread.currentThread().getName());

        //Multiplication matrix
        Matrix result = Multiplication.multiplicate(gen);

        System.out.println(Thread.currentThread().getName() + " результат");
        System.out.println(result.toString());
    }
}
