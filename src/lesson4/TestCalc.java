package lesson4;

/* 4.---
Write the test class which contains the main method.
In this main method you should create your StaticCalculator object and do some calculation to test your code,
 */

public class TestCalc {
    public static void main(String[] args) {
        StaticCalculator calc = new StaticCalculator(2.0, 3.0,"+");
        System.out.println(calc.calculate());
        StaticCalculator calc2 = new StaticCalculator();
        calc2.setValAndOper(5.0,7.0,"*");
        System.out.println(calc2.calculate());
    }
}
