package day06_oo;

public class Teacher extends Person {
    private Integer salary;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + "}" + super.toString();
    }
    
}
