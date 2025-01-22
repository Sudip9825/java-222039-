// ExceptionExample.java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
