package xml.dom;

import xml.Employee;

import java.io.File;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        File file = new File("Employees.xml");
        TestDomParse testDomParse = new TestDomParse(file);
        try {
            List<Employee> employees = testDomParse.parse();
            employees.forEach(employee -> System.out.println(employee.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
