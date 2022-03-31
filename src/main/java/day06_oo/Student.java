package day06_oo;

public class Student extends Person {
    private Integer score;
    
    public Student() {
    
    }
    
    public Student(String name, Integer age, Integer score) {
        
    }
    
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + "} " + super.toString();
    }
    
    
}
