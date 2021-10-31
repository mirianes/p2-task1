public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Point point = new Point(10, 10);
        System.out.println("++++++++++++++++++");
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());

        point.moveBy(2, 5);
        System.out.println("++++++++++++++++++");
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());

        point.setX(-10);
        point.setY(-10);
        System.out.println("++++++++++++++++++");
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());

        point.setX(450);
        point.setY(450);
        System.out.println("++++++++++++++++++");
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());

        point.moveBy(400, 400);
        System.out.println("++++++++++++++++++");
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());
    }
}
