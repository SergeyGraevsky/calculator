package Сalculator;

public class ComputationRome extends Computation{
    public void finalCalculationRome(int a, String operator, int b) throws Exception {
        int intermediateValue;
        Computation forResultRome = new Computation();
        forResultRome.finalCalculation(a,operator,b);
        String[] Rome = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX", "V", "IV", "I"};
        if (resultComputation < 4) {
            for (int i = 0; i < resultComputation; i++) {
                System.out.print(Rome[12]);
            }
        } else if (resultComputation == 4) {
            System.out.println(Rome[11]);
        } else if (resultComputation == 5) {
            System.out.println(Rome[10]);
        } else if (resultComputation < 9) {
            resultComputation = resultComputation - 5;
            System.out.print(Rome[10]);
            for (int i = 0; i < resultComputation; i++) {
                System.out.print(Rome[12]);
            }
        } else if (resultComputation == 9) {
            System.out.println(Rome[9]);
        } else if (resultComputation == 10) {
            System.out.println(Rome[8]);
        } else if (resultComputation < 40) {
            intermediateValue = resultComputation / 10;
            for (int i = 0; i < intermediateValue; i++) {
                System.out.print(Rome[8]);
            }
            resultComputation = resultComputation - (intermediateValue * 10);
            if (resultComputation < 4) {
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 4) {
                System.out.println(Rome[11]);
            } else if (resultComputation == 5) {
                System.out.println(Rome[10]);
            } else if (resultComputation < 9) {
                resultComputation = resultComputation - 5;
                System.out.print(Rome[10]);
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 9) {
                System.out.println(Rome[9]);
            }
        } else if (resultComputation == 40) {
            System.out.println(Rome[7]);
        } else if (resultComputation < 50) {
            resultComputation = resultComputation - 40;
            System.out.print(Rome[7]);
            if (resultComputation < 4) {
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 4) {
                System.out.println(Rome[11]);
            } else if (resultComputation == 5) {
                System.out.println(Rome[10]);
            } else if (resultComputation < 9) {
                resultComputation = resultComputation - 5;
                System.out.print(Rome[10]);
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation== 9) {
                System.out.println(Rome[9]);
            }
        } else if (resultComputation == 50) {
            System.out.println(Rome[6]);
        } else if (resultComputation < 90) {
            System.out.print(Rome[6]);
            resultComputation = resultComputation - 50;
            if (resultComputation < 4) {
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 4) {
                System.out.println(Rome[11]);
            } else if (resultComputation == 5) {
                System.out.println(Rome[10]);
            } else if (resultComputation < 9) {
                resultComputation = resultComputation - 5;
                System.out.print(Rome[10]);
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 9) {
                System.out.println(Rome[9]);
            } else if (resultComputation == 10) {
                System.out.println(Rome[8]);
            } else if (resultComputation < 40) {
                intermediateValue = resultComputation / 10;
                for (int i = 0; i < intermediateValue; i++) {
                    System.out.print(Rome[8]);
                }
                resultComputation = resultComputation - (intermediateValue * 10);
                if (resultComputation < 4) {
                    for (int i = 0; i < resultComputation; i++) {
                        System.out.print(Rome[12]);
                    }
                } else if (resultComputation == 4) {
                    System.out.println(Rome[11]);
                } else if (resultComputation == 5) {
                    System.out.println(Rome[10]);
                } else if (resultComputation < 9) {
                    resultComputation= resultComputation - 5;
                    System.out.print(Rome[10]);
                    for (int i = 0; i < resultComputation; i++) {
                        System.out.print(Rome[12]);
                    }
                } else if (resultComputation == 9) {
                    System.out.println(Rome[9]);
                }
            } else if (resultComputation == 40) {
                System.out.println(Rome[7]);
            } else if (resultComputation < 50) {
                resultComputation = resultComputation - 40;
                System.out.print(Rome[7]);
                if (resultComputation < 4) {
                    for (int i = 0; i < resultComputation; i++) {
                        System.out.print(Rome[12]);
                    }
                } else if (resultComputation == 4) {
                    System.out.println(Rome[11]);
                } else if (resultComputation == 5) {
                    System.out.println(Rome[10]);
                } else if (resultComputation < 9) {
                    resultComputation = resultComputation - 5;
                    System.out.print(Rome[10]);
                    for (int i = 0; i < resultComputation; i++) {
                        System.out.print(Rome[12]);
                    }
                } else if (resultComputation == 9) {
                    System.out.println(Rome[9]);
                }
            }
        } else if (resultComputation == 90) {
            System.out.println(Rome[5]);
        } else if (resultComputation < 100) {
            System.out.print(Rome[5]);
            resultComputation = resultComputation - 90;
            if (resultComputation < 4) {
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 4) {
                System.out.println(Rome[11]);
            } else if (resultComputation == 5) {
                System.out.println(Rome[10]);
            } else if (resultComputation < 9) {
                resultComputation = resultComputation - 5;
                System.out.print(Rome[10]);
                for (int i = 0; i < resultComputation; i++) {
                    System.out.print(Rome[12]);
                }
            } else if (resultComputation == 9) {
                System.out.println(Rome[9]);
            }
        }else if (resultComputation == 100){
            System.out.println(Rome[4]);
        }
    }
}


