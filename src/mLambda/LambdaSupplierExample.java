package mLambda;

import java.util.function.Supplier;

public class LambdaSupplierExample {
    public static void main(String[] arg) {
        Supplier<LambdaSupplierApple> appleSupplier = LambdaSupplierApple::new;
        appleSupplier.get().setColor("Red");
        appleSupplier.get().setWeight(2.3);
        appleSupplier.get().setCategory("Kashmiri");
        System.out.println("Apple 1");
        System.out.println("Color: " + appleSupplier.get().getColor() + ", Weight: " + appleSupplier.get().getWeight() + ", Category: " + appleSupplier.get().getCategory());
        System.out.println("=====================================");
        LambdaSupplierApple apple = appleSupplier.get();
        apple.setColor("Green");
        apple.setWeight(2.5);
        apple.setCategory("Ratnagiri");
        System.out.println("Apple 2");
        System.out.println("Color: " + apple.getColor() + ", Weight: " + apple.getWeight() + ", Category: " + apple.getCategory());
    }
}

class LambdaSupplierApple {
    private String color;
    private double weight;
    private String category;

    LambdaSupplierApple() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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