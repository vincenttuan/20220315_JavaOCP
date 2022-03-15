package day01;

public class AccountMain2 {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "A01";
        //ac1.balance = 100;
        // 存款
        ac1.deposit(100);
        // 印出帳戶餘額
        ac1.print();
        
        ac1.deposit(50);
        ac1.print();
        
        ac1.deposit(10);
        ac1.print();
        
    }
}
