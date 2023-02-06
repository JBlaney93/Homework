public class Calculator {

    public Calculator() {
//        this.x = x;
//        this.y = y;
    }

    private int x;
    private int y;

    public int add(int x, int y) {
        int result = (x + y);
        return result;
    }

    public int subtract(int x, int y) {
        int result = (x - y);
        return result;
    }

    public int multiply(int x, int y) {
        int result = (x * y);
        return result;
    }

    public double divide(double x, double y) {
        double result = (x / y);
        return result;
    }
}
