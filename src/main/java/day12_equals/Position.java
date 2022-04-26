package day12_equals;

public enum Position {
    // 各項職位的最低薪資
    總經理(100000), 經理(80000), 員工(50000);
    private int salary;
    
    // enum 的建構子權限一定是 private
    // 不寫權限預設就是 private
    Position(int salary) { 
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }
}
