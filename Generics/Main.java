package Generics;

public class Main {
    public static void main(String[] args)
    {
        Box<Integer> numbers = new Box<>(2);
        System.out.println(numbers);

        PriceAndDemand<Double,String> apple = new PriceAndDemand<>(30.0,"high");
        System.out.println(apple);
    }
}
