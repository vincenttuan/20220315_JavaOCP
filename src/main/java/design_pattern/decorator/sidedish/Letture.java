package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Letture extends Sidedish {
    
    public Letture(Food food) {
        super(food);
        name = "生菜";
        price = 15;
    }
    
}
