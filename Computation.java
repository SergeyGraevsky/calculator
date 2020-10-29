package Сalculator;

public class Computation {

    static int resultComputation;

    public static void finalCalculation(int a, String operator, int b) throws Exception {
        if ((a > 10)|(b > 10)){
            throw new CalculatorException("");
        }
            switch (operator) {
                case "+":
                    resultComputation = a + b;
                    break;
                case "-":
                    resultComputation = a - b;
                    break;
                case "*":
                    resultComputation = a * b;
                    break;
                case "/":
                    resultComputation = a / b;
                    break;
                default:
               throw new Exception("");
            }
        }
    }


