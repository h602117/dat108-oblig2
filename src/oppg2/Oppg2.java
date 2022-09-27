package oppg2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Oppg2 {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
            new Employee("Truls", "Haukeland", "Bitch", 1, Gender.FEMALE),
            new Employee("Thomas", "Jensen", "Karpe fan", 69, Gender.FEMALE),
            new Employee("Anders", "Fimreite", "Sjef Chief", 1_000_000_000, Gender.MALE),
            new Employee("Random", "Randy", "Random", 0, Gender.MALE),
            new Employee("Kristian", "Valen", "Komiker", -5, Gender.FEMALE),
            new Employee("Jørgen", "Fjølstad", "Janitor", 10, Gender.MALE)
        );

        Function<Employee, Integer> fixedValueIncrease = (emp) -> emp.getSalary() + 8750;
        Function<Employee, Integer> fixedPercentageIncrease = (emp) -> (int) (emp.getSalary() * 1.25);
        Function<Employee, Integer> fixedValueIncreaseIfLowSalary = (emp) -> emp.getSalary() + (emp.getSalary() < 410000 ? 10 : 0);
        Function<Employee, Integer> fixedPercentageIncreaseIfMan = (emp) -> emp.getSalary() * (emp.getGender() == Gender.MALE ? 2 : 1);

        printEveryone(employeeList);

        System.out.println("Fixed value increase: ");
        salarySettlement(employeeList, fixedValueIncrease);
        printEveryone(employeeList);
        resetAll(employeeList);

        System.out.println("Fixed percentage increase: ");
        salarySettlement(employeeList, fixedPercentageIncrease);
        printEveryone(employeeList);
        resetAll(employeeList);

        System.out.println("Fixed value increase if low salary: ");
        salarySettlement(employeeList, fixedValueIncreaseIfLowSalary);
        printEveryone(employeeList);
        resetAll(employeeList);

        System.out.println("Fixed percentage increase if man: ");
        salarySettlement(employeeList, fixedPercentageIncreaseIfMan);
        printEveryone(employeeList);
        resetAll(employeeList);
    }

    private static void salarySettlement(List<Employee> list, Function<Employee, Integer> func) {
        list.forEach((emp) -> emp.setSalary(func.apply(emp)));
    }

    private static void printEveryone(List<Employee> list) {
        list.forEach(System.out::println);
        System.out.println("");
    }

    private static void resetAll(List<Employee> list) {
        list.forEach((emp) -> emp.resetSalary());
    }

}
