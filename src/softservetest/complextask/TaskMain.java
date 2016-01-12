package softservetest.complextask;

import java.util.ArrayList;
import java.util.Collections;

public class TaskMain {
    public static void main(String[] args) {
        FixedPaymentEmployee fixedPaymentEmployee1 = new FixedPaymentEmployee(new Double(50), 1, "empl");
        FixedPaymentEmployee fixedPaymentEmployee2 = new FixedPaymentEmployee(new Double(60), 2, "emp2");
        FixedPaymentEmployee fixedPaymentEmployee3 = new FixedPaymentEmployee(new Double(50), 1, "emp3");
        HourlyWagedEmployee hourlyWagedEmployee4 = new HourlyWagedEmployee(4,"emp4",new Double(0.1));
        HourlyWagedEmployee hourlyWagedEmployee5 = new HourlyWagedEmployee(5,"emp5",new Double(0.02));
        HourlyWagedEmployee hourlyWagedEmployee6 = new HourlyWagedEmployee(6,"emp6",new Double(12));

        ArrayList<FixedPaymentEmployee> employees = new ArrayList<FixedPaymentEmployee>();
        employees.add(fixedPaymentEmployee1);
        employees.add(fixedPaymentEmployee2);
        employees.add(fixedPaymentEmployee3);
        employees.add(hourlyWagedEmployee4);
        employees.add(hourlyWagedEmployee5);
        employees.add(hourlyWagedEmployee6);
        Collections.sort(employees);
        for (FixedPaymentEmployee employee : employees){
            System.out.println("id=" + employee.getId() + ", name= " + employee.getName() + ", salary=" + employee.getAvarageMonthSalary() );
        }


    }

    public ArrayList<FixedPaymentEmployee> readEmployees(String filename){
        return null;
    }

    public void writeEmployees(String filename){
        //
    }
}
