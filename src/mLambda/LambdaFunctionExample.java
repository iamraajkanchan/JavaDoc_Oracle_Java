package mLambda;

import java.util.Objects;
import java.util.function.Function;

public class LambdaFunctionExample {

    public static void main(String[] a) {
        Function<String, LambdaFunctionApple> appleFunction = LambdaFunctionApple::new;
        LambdaFunctionApple apple = appleFunction.apply("Green");
        apple.setWeight(2.5);
        apple.setCategory("Ratnagiri");
        System.out.println("Apple");
        System.out.println("Color: " + apple.getColor() + ", Weight: " + apple.getWeight() + ", Category: " + apple.getCategory());

        LambdaFunctionApple apple1 = appleFunction.apply("Red");
        apple1.setWeight(2.25);
        apple1.setCategory("Kashmiri");
        System.out.println("Apple");
        System.out.println("Color: " + apple1.getColor() + ", Weight: " + apple1.getWeight() + ", Category: " + apple1.getCategory());
        Function<String, String> groupedApples = appleFunction.andThen(LambdaFunctionApple::getCategory);
        System.out.println(groupedApples);
    }

}

class LambdaFunctionApple {
    private final String color;
    private double weight;
    private String category;

    LambdaFunctionApple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}