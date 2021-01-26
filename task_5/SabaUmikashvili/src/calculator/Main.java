package calculator;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("47 + 53 = " + calculatorService.sum(47, 53));
        System.out.println("8 * 8 = " + calculatorService.mul(8, 8));
    }
}
