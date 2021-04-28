package utils;

public class Main {
    public static void main(String[] args) {
        //Generate few matrix with random content and sizes
        Generator gen = new Generator();
        gen.generate(Thread.currentThread().getName());

        //Multiplication matrix
        Matrix result = Multiplication.multiplicate(gen);

        System.out.println(Thread.currentThread().getName() + " результат");
        System.out.println(result.toString());
    }
}
