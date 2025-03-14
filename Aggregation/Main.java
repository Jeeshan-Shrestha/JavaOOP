package Aggregation;

public class Main
{
    public static void main(String[] args)
    {
        Cards Pikachu = new Cards("Pikachu");
        Cards Squirtle = new Cards("Squirtle");
        Cards Bulbasaur = new Cards("Bulbasaur");
        Cards[] myCardCollection = {Pikachu,Squirtle,Bulbasaur};
        Deck narasDeck = new Deck("NarasDeck",myCardCollection);
        narasDeck.ShowDetail();
    }
}
