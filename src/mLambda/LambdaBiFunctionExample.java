package mLambda;

import java.util.function.BiFunction;

public class LambdaBiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, Double, LambdaBiFunctionApple> biFunctionAppleBiFunction = LambdaBiFunctionApple::new;
        LambdaBiFunctionApple apple = biFunctionAppleBiFunction.apply("Green",2.34);
        apple.setCategory("Kashmiri");
        System.out.println("Color: " + apple.getColor() + ", Weight: " + apple.getWeight() + ", Category: " + apple.getCategory());
    }
}

class LambdaBiFunctionApple {
    private final String color;
    private final double weight;
    private String category;

    LambdaBiFunctionApple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
