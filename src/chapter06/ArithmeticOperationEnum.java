package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 10:09
 */
public enum ArithmeticOperationEnum implements ArithmeticOperation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private String symbol;

    ArithmeticOperationEnum(String argSymbol) {
        symbol = argSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
