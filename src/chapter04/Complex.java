package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/2 15:51
 */
public final class Complex {
    private final double mRe;
    private final double mIm;

    public Complex(double argRe, double argIm) {
        mRe = argRe;
        mIm = argIm;
    }

    public double getRe() {
        return mRe;
    }

    public double getIm() {
        return mIm;
    }

    public Complex add(Complex argComplex) {
        return new Complex(mRe + argComplex.mRe, mIm + argComplex.mIm);
    }

    public Complex subtract(Complex argComplex) {
        return new Complex(mRe - argComplex.mRe, mIm - argComplex.mIm);
    }

    public Complex multiply(Complex argComplex) {
        return new Complex(mRe * argComplex.mRe - mIm * argComplex.mIm, mRe * argComplex.mIm + mIm * argComplex.mRe);
    }

    public Complex divide(Complex argComplex) {
        double temp = argComplex.mRe * argComplex.mRe + argComplex.mIm * argComplex.mIm;
        return new Complex((mRe * argComplex.mRe + mIm * argComplex.mIm) / temp, -(mRe * argComplex.mIm - mIm * argComplex.mRe) / temp);
    }

    @Override
    public boolean equals(Object argO) {
        if (this == argO) return true;
        if (argO == null || getClass() != argO.getClass()) return false;

        Complex complex = (Complex) argO;

        if (Double.compare(complex.mRe, mRe) != 0) return false;
        return Double.compare(complex.mIm, mIm) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(mRe);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mIm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "mRe=" + mRe +
                ", mIm=" + mIm +
                '}';
    }
}
