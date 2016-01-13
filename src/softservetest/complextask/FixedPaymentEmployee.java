package softservetest.complextask;

import java.io.Serializable;
import java.util.Comparator;

public class FixedPaymentEmployee implements Employee, Comparable, Serializable {
    private Double fixedPayment;
    private Integer id;
    private String name;

        @Override
    public int compareTo(Object o) {
        if (o instanceof FixedPaymentEmployee){
            FixedPaymentEmployee employee = (FixedPaymentEmployee)o;
            if (this.getAvarageMonthSalary() > employee.getAvarageMonthSalary()){
                return 1;
            }
            if (this.getAvarageMonthSalary() < employee.getAvarageMonthSalary()){
                return -1;
            }
            if (this.getAvarageMonthSalary() == employee.getAvarageMonthSalary()){
                int i = this.getName().compareTo(employee.getName());
                if(i != 0){
                    return i;
                }
                else{
                    return this.getId().compareTo(employee.getId());
                }
            }
        }
        else {
            return 0;
        }
            return 0;

    }

    @Override
    public Double getAvarageMonthSalary() {
        return fixedPayment;
    }

    public FixedPaymentEmployee() {
    }

    public FixedPaymentEmployee(Double fixedPayment, Integer id, String name) {
        this.fixedPayment = fixedPayment;
        this.id = id;
        this.name = name;
    }

    public FixedPaymentEmployee(Double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public Double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(Double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
