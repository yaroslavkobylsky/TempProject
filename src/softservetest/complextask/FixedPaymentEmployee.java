package softservetest.complextask;

import java.util.Comparator;

public class FixedPaymentEmployee extends AbstractEmployee {
    private Double fixedPayment;

    @Override
    public Double getAvarageMonthSalary() {
        return fixedPayment;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public FixedPaymentEmployee() {
    }

    public FixedPaymentEmployee(Double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }
}
