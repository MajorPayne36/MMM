package matrix;

public class Matrix {

    private int[][] content;

    private final int width;
    private final int height;

    public Matrix(int m, int n) {
        this.width = m;
        this.height = n;
        this.content = new int[width][height];

        genRandomContent();
    }

    /**
     * Generate random content for matrix
     */
    private void genRandomContent() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                content[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int[][] getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                s.append(" ").append(content[i][j]);
            }
            s.append("\n");
        }

        return s.toString();
    }
}
