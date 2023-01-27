package basics;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExampleWithException {
    private int empId;
    private String empName;
    private int age;
    private double salary;
    private String designation;

    ScannerExampleWithException(int empId, String empName, int age, double salary, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    public void getInputFromUser() throws InputMismatchException, NumberFormatException {
        Scanner sc = new Scanner(System.in);
        try {
            getEmployeeID(sc);
        } catch (Exception e) {
            handleException(e, "Please Enter a Valid Employee ID");
        }
        System.out.println("Enter your empName: ");
        empName = sc.nextLine();
        try {
            getEmployeeAge(sc);
        } catch (Exception e) {
            handleException(e, "Please Enter a Valid Employee Age");
        }
        try {
            getEmployeeSalary(sc);
        } catch (Exception e) {
            handleException(e, "Please Enter a Valid Employee Salary");
        }
        System.out.println("Enter your designation: ");
        designation = sc.nextLine();
    }

    private void getEmployeeID(@NotNull Scanner sc) throws InputMismatchException, NumberFormatException {
        System.out.println("Enter your empId: ");
        empId = Integer.parseInt(sc.nextLine());
    }

    private void getEmployeeAge(@NotNull Scanner sc) throws InputMismatchException, NumberFormatException {
        System.out.println("Enter your age: ");
        age = Integer.parseInt(sc.nextLine());
    }

    private void getEmployeeSalary(@NotNull Scanner sc) throws InputMismatchException, NumberFormatException {
        System.out.println("Enter your salary");
        salary = Double.parseDouble(sc.nextLine());
    }

    private void handleException(@NotNull Exception e, String message) {
        e.printStackTrace();
        System.out.println(message);
        System.out.println("Running the main method again!");
        System.out.println("Please wait...");
        main(null);
    }

    public void display() {
        System.out.println("=====================");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        int employeeID = 0;
        int employeeAge = 0;
        double employeeSalary = 0.0;
        ScannerExampleWithException param = new ScannerExampleWithException(employeeID, null, employeeAge, employeeSalary, null);

        param.getInputFromUser();
        param.display();
        throwMyException();
    }

    public static void throwMyException() {
        throw new ArithmeticException("This is an arithmetic exception");
    }
}
