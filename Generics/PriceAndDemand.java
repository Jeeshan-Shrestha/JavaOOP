package Generics;

public class PriceAndDemand<T,U> {
    T price;
    U demand;
    PriceAndDemand(T price, U demand)
    {
        this.price = price;
        this.demand = demand;
    }
    public String toString()
    {
        return "The price and demand of this product is: "+ this.price + " " + this.demand;
    }
}
