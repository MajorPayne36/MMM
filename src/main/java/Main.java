public class Main {
    public static void main(String[] args) {
        MatrixRunnable mr = new MatrixRunnable();

        //Creating threads
        Thread one = new Thread(mr);
        Thread two = new Thread(mr);
        Thread three = new Thread(mr);

        //Naming threads
        one.setName("Первый поток");
        two.setName("Второй поток");
        three.setName("Третий поток");

        //Starting threads
        one.start();
        two.start();
        three.start();
    }
}
