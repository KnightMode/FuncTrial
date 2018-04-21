import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeesSorterTest {

    EmployeesSorter sorter;
    List<Employees> employeesList;
    private Employees person1, ganesh, person2, person3, person4;

    @Before
    public void setup() {

        sorter = new EmployeesSorter();
        ganesh = new Employees("ShreeGhanesh", "M", 23, 10000);
        person1 = new Employees("Person 1", "F", 30, 6000);
        person2 = new Employees("Person 2", "M", 24, 80000);
        person3 = new Employees("Person 3", "M", 24, 12000);
        person4 = new Employees("Person 4", "F", 27, 9000);
        employeesList = new ArrayList<>(Arrays.asList(ganesh, person1, person2, person4, person3));

    }

    @Test
    public void sortsAgeGreaterThanTwentyFour() {
        assertThat(sorter.ageGreaterThanTwentyFour(employeesList)).contains(person1, person4);
    }

    @Test
    public void sortsTopThreeSalaries() {
        assertThat(sorter.topThreeSalaries(employeesList)).containsExactly(person2, person3, ganesh);
    }
}