package org.example;
public class Main {
    public static void main(String[] args) {

        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        Employee.printNumberOfEmployees();

//        var browser = new Browser();
//        browser.navigate("asdasd");
    }

}