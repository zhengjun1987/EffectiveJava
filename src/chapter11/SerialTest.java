package chapter11;

import java.io.InvalidObjectException;
import java.io.Serializable;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/9 17:27
 */
public class SerialTest implements Serializable {
    private String mString;
    private int mInt;
    private Object mObject;

    public SerialTest(String argString, int argInt, Object argObject) {
        mString = argString;
        mInt = argInt;
        mObject = argObject;
    }

    private void readObjectNoData() throws InvalidObjectException {
        throw new InvalidObjectException("Stream data required");
    }
}
