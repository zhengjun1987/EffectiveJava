package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 14:35
 */
public enum PayrollDayUpdated {
    MONDAY(WorkDay.WORKDAY),
    TUESDAY(WorkDay.WORKDAY),
    WEDNESDAY(WorkDay.WORKDAY),
    THURSDAY(WorkDay.WORKDAY),
    FRIDAY(WorkDay.WORKDAY),
    SATURDAY(WorkDay.WEEKEND),
    SUNDAY(WorkDay.WEEKEND);
    private static final int HOURS_PER_SHIFT = 8;

    private enum WorkDay {
        WORKDAY {
            @Override
            double overtimePay(double workedHours, double payRate) {
                return workedHours <= HOURS_PER_SHIFT ? 0 : (workedHours - HOURS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            @Override
            double overtimePay(double workedHours, double payRate) {
                return workedHours * payRate / 2;
            }
        };

        abstract double overtimePay(double workedHours, double payRate);
    }

    private WorkDay mWorkDay;

    PayrollDayUpdated(WorkDay argWorkDay) {
        mWorkDay = argWorkDay;
    }

    double pay(double workedHours, double payRate) {
        return workedHours * payRate + mWorkDay.overtimePay(workedHours, payRate);
    }
}
