package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 10:15
 */
public enum ExtendedArithmeticOperationEnum implements ArithmeticOperation {
    EXP("^") {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    MOD("%") {
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private String symbol;

    ExtendedArithmeticOperationEnum(String argSymbol) {
        symbol = argSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
