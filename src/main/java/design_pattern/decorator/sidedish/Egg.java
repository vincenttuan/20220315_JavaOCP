package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Egg extends Sidedish {
    
    public Egg(Food food) {
        super(food);
        name = "雞蛋";
        price = 30;
    }
    
}
