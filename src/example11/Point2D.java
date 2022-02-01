package example11;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {

    this.x = x;
    this.y = y;}
    public Point2D(int size){
    x = size;
    y = size;

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
