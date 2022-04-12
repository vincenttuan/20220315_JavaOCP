package day08_oo;

public class PersonMain2 {
    // 使用多型
    public static void main(String[] args) {
        Person p1 = new Student("John", 18, 100);
        Person p2 = new Student("Jane", 19, 90);
        Person p3 = new Teacher("Mary", 28, 55000);
        Student s1 = new Student("Helen", 18, 70);
        Teacher t1 = new Teacher("Bob", 35, 78000);
        
        Person[] people = {p1, p2, p3, s1, t1};
        for(Person person : people) {
            System.out.println(person.getName());
        }
        
        
    }
}
