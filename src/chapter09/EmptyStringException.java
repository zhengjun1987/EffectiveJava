package chapter09;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/7 15:42
 */
public class EmptyStringException extends Exception {
    private final int code;

    public EmptyStringException(int argCode, String message) {
        super(message);
        code = argCode;
    }

    public int getCode() {
        return code;
    }
}
