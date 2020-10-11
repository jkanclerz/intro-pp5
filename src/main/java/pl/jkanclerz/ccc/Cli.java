package pl.jkanclerz.ccc;

import pl.jkanclerz.ccc.factory.Employee;
import pl.jkanclerz.ccc.factory.FactoryConfiguration;
import pl.jkanclerz.ccc.factory.Product;

public final class Cli {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee employee = FactoryConfiguration.getResponsibleEmployee();
        Product p1 = employee.doSomeJob();
        Product p2 = employee.doSomeJob();
        Product p3 = employee.doSomeJob();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
