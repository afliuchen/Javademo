package demo3;

import java.lang.reflect.Type;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int Calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        Calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return Calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public enum Type {MEAT,FISH,OTHER}
}
