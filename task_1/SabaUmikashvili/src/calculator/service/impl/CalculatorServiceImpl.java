package calculator.service.impl;

public class CalculatorServiceImpl implements CalculatorService {
    public void sum(int x, int y) {System.out.println(x + y);}
    public void sum(float x, float y) {System.out.println(x + y);}
    public void devide(int x, int y) {
        try {
            System.out.println(x / y);
        } catch(ArithmeticException e) {
            System.out.println("/ by zero");
        }
    }
    public void devide(float x, float y) {
        try {
            System.out.println(x / y);
        } catch(ArithmeticException e) {
            System.out.println("/ by zero");
        }
    }
}
