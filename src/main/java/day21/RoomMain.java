package day21;

public class RoomMain {
    public static void main(String[] args) {
        // 有一間房間(診間)
        Room room = new Room();
        // 有三位病人
        Person p1 = new Person(room);
        Person p2 = new Person(room);
        Person p3 = new Person(room);
        Person p4 = new Person(room);
        Person p5 = new Person(room);
        Person p6 = new Person(room);
        // 設定執行緒名稱
        p1.setName("小明");
        p2.setName("小華");
        p3.setName("小英");
        
        // 爭先恐後去看診
        p1.start();
        p2.start();
        p3.start();
    }
}
