package chapter06;

import java.util.HashMap;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 11:30
 */
public enum Operation {
    PLUS("+") {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    }, MINUS("-") {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    }, TIMES("*") {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    private String symbol;

    Operation(String argSymbol) {
        symbol = argSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    private static HashMap<String,Operation> sOperationHashMap;

    static {
        sOperationHashMap=new HashMap<>();
        for (Operation operation : values()) {
            sOperationHashMap.put(operation.toString(),operation);
        }
    }

    public static Operation fromString(String argSymbol){
        return sOperationHashMap.get(argSymbol);
    }

    abstract double apply(double x, double y);

    public static void main(String[] args) {
        double x = 2, y = 1;
        for (Operation operation : Operation.values()) {
            System.out.printf("%.2f %s %.2f = %f%n", x, operation.symbol, y, operation.apply(x, y));
        }
    }
}
//        2.000000 + 1.000000 = 3.000000
//        2.000000 - 1.000000 = 1.000000
//        2.000000 * 1.000000 = 2.000000
//        2.000000 / 1.000000 = 2.000000
