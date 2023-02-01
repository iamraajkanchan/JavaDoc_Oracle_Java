package mLambda;

public class LambdaCustomFunctionExample {
    public static void main(String[] args) {
        ILambdaDefinedSupplier lambdaDefinedSupplier = LambdaCustomFunctionApple::new;
        LambdaCustomFunctionApple definedApple = lambdaDefinedSupplier.get("Red", 2.23,"Kashmiri");
        System.out.println("Defined Apple");
        System.out.println("Color : " + definedApple.color() + ", Weight: " + definedApple.weight() + ", Category: " + definedApple.category());

        ILambdaCustomSupplier<String, Double, String, LambdaCustomFunctionApple> lambdaCustomSupplier = LambdaCustomFunctionApple::new;
        LambdaCustomFunctionApple customApple = lambdaCustomSupplier.get("Green", 1.53,"Nashik");
        System.out.println("Custom Apple");
        System.out.println("Color : " + customApple.color() + ", Weight: " + customApple.weight() + ", Category: " + customApple.category());
    }
}

interface ILambdaCustomSupplier<T, U, V, R> {
    R get(T color, U weight, V category);
}

interface ILambdaDefinedSupplier {
    LambdaCustomFunctionApple get(String color, Double weight, String Category);
}

record LambdaCustomFunctionApple(String color, double weight, String category) {
}