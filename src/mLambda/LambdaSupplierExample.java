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
        LambdaSupplierApple apple2 = appleSupplier.get();
        apple2.setColor("Green");
        apple2.setWeight(2.5);
        apple2.setCategory("Ratnagiri");
        System.out.println("Apple 2");
        System.out.println("Color: " + apple2.getColor() + ", Weight: " + apple2.getWeight() + ", Category: " + apple2.getCategory());
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