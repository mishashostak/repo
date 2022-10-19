public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            System.out.printf("0/0/0/0 equals %d", r.getX1() / r.getX2() / r.getY1() / r.getY2());
        } catch (ArithmeticException e){
            System.out.println("0/0 is 2");
        }
    }
}
