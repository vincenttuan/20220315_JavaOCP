package day10_oo3;

public class PetStore {
    public static void main(String[] args) {
        Dog dog1 = new Shiba();
        Dog dog2 = new Chihuahua();
        System.out.println(Dog.LEGS);
        System.out.println(dog1.getClass().getSimpleName());
        System.out.println(dog2.getClass().getSimpleName());
        dog1.skill();
        dog1.eat();
        dog2.skill();
        dog2.eat();
        
    }
}
