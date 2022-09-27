package oppg3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Oppg3 {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
            new Employee("Truls", "Haukeland", "Bitch", 1, Gender.FEMALE),
            new Employee("Thomas", "Jensen", "Karpe fan", 69, Gender.FEMALE),
            new Employee("Anders", "Fimreite", "Sjef Chief", 1_000_000_000, Gender.MALE),
            new Employee("Random", "Randy", "Random", 0, Gender.MALE),
            new Employee("Kristian", "Valen", "Komiker", -5, Gender.FEMALE),
            new Employee("Jørgen", "Fjølstad", "Janitor", 10, Gender.MALE)
        );

        // a)
        List<String> lastnameList = employeeList.stream().map((emp) -> emp.getLastname()).toList();
        System.out.println("\nOppg 3a: Every employee's lastname:\n" + lastnameList);

        // b)
        long countFemales = employeeList.stream().filter((emp) -> emp.getGender() == Gender.FEMALE).count();
        System.out.println("\nOppg 3b: Amonut of female employee's:\n" + countFemales);

        // c)
        double avarageFemaleSalary = employeeList.stream().filter((emp) -> emp.getGender() == Gender.FEMALE).mapToInt(Employee::getSalary).average().orElse(0);
        System.out.println("\nOppg 3c: Avarage salary of female employee's:\n" + avarageFemaleSalary);

        // d)
        employeeList.stream().filter((emp) -> emp.getPosition().toLowerCase().contains("chief")).forEach((emp) -> emp.setSalary((int) (emp.getSalary() * 1.07)));
        System.out.println("\nOppg 3d: Chief get more money:");
        printEveryone(employeeList);

        // e)
        boolean salaryAbove = employeeList.stream().anyMatch((emp) -> emp.getSalary() > 800_000);
        System.out.println("\nOppg 3e: Employee's that makes more than 800 000:\n" + salaryAbove);

        // f)
        System.out.println("\nOppg 3f: Print with no loops:");
        employeeList.stream().forEach((emp) -> System.out.println(emp));

        // g)
        Employee lowestSalary = employeeList.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println("\nOppg 3g: Employee with the lowest salary:\n" + lowestSalary);

        // h)
        int sum = IntStream.range(1, 1000).filter((i) -> (i % 3 == 0) || (i % 5 == 0)).sum();
        System.out.println("\nOppg 3h: Sum of every integer i [i, 1000> that is divisible by either 3 or 5:\n" + sum);
    }

    private static void printEveryone(List<Employee> list) {
        list.forEach(System.out::println);
    }

}
