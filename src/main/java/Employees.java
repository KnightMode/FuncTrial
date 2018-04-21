public class Employees {
    private String empName, gender;
    private Integer age;

    public Employees(String empName, String gender, Integer age) {
        this.empName = empName;
        this.gender = gender;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employees{" +
                "empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
