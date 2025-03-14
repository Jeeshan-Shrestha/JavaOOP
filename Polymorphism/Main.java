package Polymorphism;

public class Main
{
    public static void main(String[] args)
    {
        Organism[] organisms = {new Human(),new Plants()};
        organisms[0].breath();
    }
}
