package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Tuna extends Sidedish {
    
    public Tuna(Food food) {
        super(food);
        name = "鮪魚";
        price = 25;
    }
    
}
