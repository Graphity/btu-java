package calculator.service;

import calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args6) {
        CalculatorServiceImpl obj = new CalculatorServiceImpl();
        obj.sum(51, 49);
        obj.sum(4.99f, 3.44f);
        obj.devide(99, 33);
        obj.devide(100, 0);
        obj.devide(9.99f, 3.11f);
    }
}
