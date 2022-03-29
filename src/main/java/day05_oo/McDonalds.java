package day05_oo;

// 麥當勞
public class McDonalds {
    public static void main(String[] args) {
        // 起司
        Cheese cheese1 = new Cheese("巧達起司", 5);
        Cheese cheese2 = new Cheese("帕瑪森起司", 20);
        // 牛肉
        Beef beef1 = new Beef("碎牛肉", 15);
        Beef beef2 = new Beef("菲力", 35);
        // 麵包
        Bread bread1 = new Bread("馬芬麵包", 10);
        Bread bread2 = new Bread("芝麻麵包", 12);
        // 印出所有原料資訊
        System.out.println(cheese1); // cheese1.toString()
        System.out.println(cheese2);
        System.out.println(beef1);
        System.out.println(beef2);
        System.out.println(bread1);
        System.out.println(bread2);
        
        // 吉士牛肉漢堡
        
    }
}
