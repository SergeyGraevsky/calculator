package Сalculator;

public class ComputationArab extends Computation{
    public void finalCalculationArab(int a, String operator, int b) throws Exception {
        Computation forResultArab = new Computation();
        forResultArab.finalCalculation(a, operator, b);
        System.out.println(resultComputation);
    }
}
