public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setX1(1);
        r.setX2(-2);
        r.setFilled(true);
        System.out.println("rect - X1: " + r.getX1());
        System.out.println("rect - X2: " + r.getX2());
        System.out.println("rect - Y1: " + r.getY1());
        System.out.println("rect - Y2: " + r.getY2());
        System.out.println("rect - Filled: " +r.getFilled());
        System.out.println("rect - count: " + r.getCount());
        System.out.println("rect - upper left x: " + r.getTopLeftX());
        System.out.println("rect - upper left y: " + r.getTopLeftY());
        System.out.println("rect - width: " + r.getWidth());
        System.out.println("rect - height: " + r.getHeight());
        System.out.println("rect - area: " + r.calcArea());
    }
}