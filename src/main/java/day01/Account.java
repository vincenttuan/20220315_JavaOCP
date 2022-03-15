package day01;

// 帳戶
public class Account { 
    String name; // 戶名
    int balance; // 帳戶餘額
    
    // 存款的程序(存款方法)
    // amount: 存款金額
    public void deposit(int amount) {
        if(amount <= 0) {
            System.out.println("金額錯誤");
            return; // 中斷方法
        }
        balance += amount;
    }
    
    // 提款的程序(提款方法)
    public void withdrawal(int amount) {
        if(amount <= 0) {
            System.out.println("金額錯誤");
            return; // 中斷方法
        }
        if(balance >= amount) {
            balance -= amount; // balance = balance - amount;
        } else {
            System.out.println("餘額不足");
        }
    }
    
    // 印出帳戶餘額
    public void print() {
        System.out.printf("%s $%,d\n", name, balance);
    }
}
