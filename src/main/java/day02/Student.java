package day02;

public class Student {
    String name; // 姓名
    double height; // 身高
    double weight; // 體重
    int score; // 分數
    // 設定姓名
    void setName(String name) {
        this.name = name;
    }
    // 設定身高
    void setHeight(double h) {
        height = h;
    }
    // 設定體重
    void setWeight(double w) {
        weight = w;
    }
    // 設定分數
    void setScore(int score) {
        this.score = score;
    }
    // 印出學生資料
    void print() {
        System.out.printf("name:%s height:%.1f weight:%.1f score:%d\n", name, height, weight, score);
    }
    
}
