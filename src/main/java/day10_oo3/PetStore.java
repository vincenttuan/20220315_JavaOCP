package day10_oo3;

import java.util.stream.Stream;

public class PetStore {
    public static void main(String[] args) {
        //Dog d1 = new Dog(); // interface 介面不可"直接" new
        //Dog d2 = new AbstractDog(); // abstract class 抽象類別也不可"直接" new
        
        Dog dog1 = new Shiba();
        Dog dog2 = new Chihuahua();
        Dog dog3 = new EDog();
        System.out.println(Dog.LEGS);
        System.out.println(dog1.getClass().getSimpleName());
        System.out.println(dog2.getClass().getSimpleName());
        dog1.skill();
        dog1.eat();
        dog2.skill();
        dog2.eat();
        dog3.skill();
        dog3.eat();
        // Java 8
        Dog[] dogs = {dog1, dog2, dog3};
        Stream.of(dogs).forEach(dog -> {
            dog.skill();
            dog.eat();
        });
        
        AbstractCat[] cats = {new PersianCat(), new SiameseCat()};
        // Java 5 以前
        for(int i=0;i<cats.length;i++) {
            AbstractCat cat = cats[i];
            cat.eat();
            cat.skill();
        }
        // Java 5 ~ 7 的寫法
        for(AbstractCat cat : cats) {
            cat.eat();
            cat.skill();
        }
        // Java 8
        Stream.of(cats).forEach(cat -> {
            cat.eat();
            cat.skill();
        });
        
        
    }
}
