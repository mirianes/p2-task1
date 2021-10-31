public class Point {
    protected int x = 0, y = 0;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { 
        if (x >= 0 && x <= 400) {
            this.x = x; 
        }
    }
    public void setY(int y) { 
        if (y >= 0 && y <= 400) {
            this.y = y; 
        }
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
}
