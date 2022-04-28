package day13_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemoExam {
    public static void main(String[] args) {
        Exam e1 = new Exam("國文", 100);
        Exam e2 = new Exam("英文", 70);
        Exam e3 = new Exam("數學", 100);
        
        Set<Exam> exams = new LinkedHashSet<>();
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);
        System.out.println(exams.size());
        System.out.println(exams);
        
        // 請求出總分 = ?
        int sum1 = exams.stream().mapToInt(exam -> exam.getScore()).sum();
        int sum2 = exams.stream().mapToInt(Exam::getScore).sum();
        System.out.println(sum1);
        System.out.println(sum2);
                
        // 請求出最高分 = ?
        int max = exams.stream().mapToInt(Exam::getScore).max().getAsInt();
        System.out.println(max);
        
        // 請求出最高分的科目 = ?
        
    }
}
