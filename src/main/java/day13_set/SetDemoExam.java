package day13_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemoExam {
    public static void main(String[] args) {
        Exam e1 = new Exam("國文", 100);
        Exam e2 = new Exam("英文", 70);
        Exam e3 = new Exam("數學", 90);
        
        Set<Exam> exams = new LinkedHashSet<>();
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);
        
        System.out.println(exams);
        
        
    }
}
