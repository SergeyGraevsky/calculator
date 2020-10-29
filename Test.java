package Сalculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String lineFromInput = scanner.nextLine();
        String[] splitString = lineFromInput.split(" ");
        for (String index : splitString) {

        }
        if ((splitString.length > 3)|(splitString.length < 3)){
            throw new CalculatorException("Некорректный ввод данных !");
        }
        UnderstandingStrings understanding = new UnderstandingStrings(splitString[0],splitString[1],splitString[2]);
        understanding.isolating();


    }
}
