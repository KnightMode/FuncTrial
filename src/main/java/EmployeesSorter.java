import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesSorter {
    Employees ganesh = new Employees("ShreeGhanesh", "M", 23, 10000);
    Employees person1 = new Employees("Person 1", "F", 30, 6000);
    Employees person2 = new Employees("Person 2", "M", 24, 80000);
    Employees person3 = new Employees("Person 3", "M", 24, 12000);
    Employees person4 = new Employees("Person 4", "F", 27, 9000);

    List<Employees> employeesList = new ArrayList<>(Arrays.asList(ganesh, person1, person2, person4, person3));

    List<Integer> evenNumbers = getEvenNumbers();

    List<Employees> maleEmployees = maleEmployeeList(employeesList, "M");

    List<Employees> salaryRangeDescending = topThreeSalaries(employeesList);

    public List<Employees> topThreeSalaries(List<Employees> employeesList) {
        return employeesList.stream()
                .sorted((emp1, emp2) -> emp2.getSalary().compareTo(emp1.getSalary()))
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Employees> maleEmployeeList(List<Employees> employeesList, String m) {
        return employeesList.stream()
                .filter(employees -> employees.getGender()
                        .equals(m)).collect(Collectors.toList());
    }

    public List<Integer> getEvenNumbers() {
        return new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))
                .stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Employees> ageGreaterThanTwentyFour(List<Employees> employeesList) {
        return employeesList.stream()
                .filter(employees -> employees.getAge() >= 24)
                .collect(Collectors.toList());
    }
}
