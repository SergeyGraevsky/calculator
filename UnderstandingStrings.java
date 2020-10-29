package Сalculator;

import java.util.concurrent.CancellationException;

public class UnderstandingStrings {
    static String[] forInputRome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static int[] forInputArab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public String a, b, operator;
    boolean resultOfCheckingA, resultOfCheckingB;
    int resultOfCheckingRomeA, resultOfCheckingRomeB, resultOfCheckingArabA, resultOfCheckingArabB;
    public UnderstandingStrings(String a, String operator, String b) {
        this.a = a;
        this.operator = operator;
        this.b = b;
    }
    public void isolating() throws Exception {
        try {
            StringBuilder checkRomA = new StringBuilder(a);
            for (int i = 0; i < forInputRome.length; i++) {
                if (forInputRome[i].equals(a)) {
                    resultOfCheckingA = forInputRome[i].equals(a);
                    if (resultOfCheckingA == true) {
                        resultOfCheckingRomeA = forInputArab[i];
                    }
                }
            }
            if (resultOfCheckingA == false) {
                resultOfCheckingArabA = Integer.parseInt(a);
            }
            StringBuilder checkRomB = new StringBuilder(b);
            for (int i = 0; i < forInputRome.length; i++) {
                if (forInputRome[i].equals(b)) {
                    resultOfCheckingB = forInputRome[i].equals(b);

                    if (resultOfCheckingB == true) {
                        resultOfCheckingRomeB = forInputArab[i];
                    }
                }
            }
            if (resultOfCheckingB == false) {
                resultOfCheckingArabB = Integer.parseInt(b);
            }
            if ((resultOfCheckingA == true) & (resultOfCheckingB == true)) {
                ComputationRome toCalculateRome = new ComputationRome();
                toCalculateRome.finalCalculationRome(resultOfCheckingRomeA, operator, resultOfCheckingRomeB);
            } else if ((resultOfCheckingA == false) & (resultOfCheckingB == false)) {
                ComputationArab toCalculate = new ComputationArab();
                toCalculate.finalCalculationArab(resultOfCheckingArabA, operator, resultOfCheckingArabB);
            }else {
                throw new CalculatorException("");
            }
        } catch (Exception e) {
            throw new CalculatorException("Некорректный ввод данных !");
        }
    }
}
