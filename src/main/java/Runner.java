import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();

        Employees ganesh = new Employees("ShreeGhanesh", "M", 23);
        Employees person1 = new Employees("Person 1", "F", 30);
        Employees person2 = new Employees("Person 2", "M", 24);
        Employees person3 = new Employees("Person 3", "M", 24);
        Employees person4 = new Employees("Person 4", "F", 27);

        employeesList.addAll(Arrays.asList(new Employees[]{ganesh, person1, person2, person4, person3}));

        List<Employees> sortedList = employeesList.stream()
                .filter(employees -> employees.getAge() >= 24)
                .collect(Collectors.toList());

        List<Integer> naturalNos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))
                .stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(naturalNos);

        System.out.println(sortedList.toString());
    }
}

