public class Employees {
    private String empName, gender;
    private Integer age, Salary;

    public Employees(String empName, String gender, Integer age, Integer salary) {
        this.empName = empName;
        this.gender = gender;
        this.age = age;
        Salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}';
    }
}
