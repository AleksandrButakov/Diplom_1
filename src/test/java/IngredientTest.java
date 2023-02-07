/*
public class Ingredient {

    public IngredientType type;
    public String name;
    public float price;

    public Ingredient(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public IngredientType getType() {
        return type;
    }

}
 */

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {
    private IngredientType type;
    private String name;
    private float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static


}
