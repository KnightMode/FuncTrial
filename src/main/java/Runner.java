import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        Employees ganesh = new Employees("ShreeGhanesh", "M", 23, 10000);
        Employees person1 = new Employees("Person 1", "F", 30, 6000);
        Employees person2 = new Employees("Person 2", "M", 24, 80000);
        Employees person3 = new Employees("Person 3", "M", 24, 12000);
        Employees person4 = new Employees("Person 4", "F", 27, 9000);

        List<Employees> employeesList = new ArrayList<>(Arrays.asList(ganesh, person1, person2, person4, person3));

        List<Employees> sortedList = employeesList.stream()
                .filter(employees -> employees.getAge() >= 24)
                .collect(Collectors.toList());

        List<Integer> naturalNos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))
                .stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        List<Employees> maleEmployees = employeesList.stream()
                .filter(employees -> employees.getGender()
                        .equals("M")).collect(Collectors.toList());

        List<Employees> femaleEmployees = employeesList.stream().filter(employees -> employees.getGender().equals("F")).collect(Collectors.toList());

        List<Employees> salaryRangeDescending = employeesList
                .stream()
                .sorted((emp1, emp2) -> emp2.getSalary().compareTo(emp1.getSalary()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(naturalNos);

        System.out.println("Female Employees:+" + femaleEmployees.toString());

        System.out.println("Details of male Employees are:\r\n" + maleEmployees.toString() + "\r\n");

        System.out.println("Top 3 Salaries:\r\n" + salaryRangeDescending);
    }
}

