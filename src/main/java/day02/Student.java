package day02;
// 設計一個學生類
public class Student {
    private String name; // 姓名
    private double height; // 身高
    private double weight; // 體重
    private int score; // 分數
    // 設定姓名
    void setName(String name) {
        this.name = name;
    }
    // 設定身高
    void setHeight(double h) {
        if(h <= 0 || h>250) {
            System.out.println("身高資料錯誤");
            return;
        }
        height = h;
    }
    // 設定體重
    void setWeight(double w) {
        if(w <= 0 || w>300) {
            System.out.println("體重資料錯誤");
            return;
        }
        weight = w;
    }
    // 設定分數
    void setScore(int score) {
        if(score < 0 || score>100) {
            System.out.println("分數資料錯誤");
            return;
        }
        this.score = score;
    }
    // 印出學生資料
    void print() {
        System.out.printf("name:%s height:%.1f weight:%.1f score:%d\n", name, height, weight, score);
    }
    
}
