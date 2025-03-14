package Aggregation;

public class Deck
{
    private String deckName;
    Cards[] cards;
    Deck(String deckName,Cards[] cards)
    {
        this.deckName = deckName;
        for (Cards c : cards)
        {
            this.cards = cards;
        }
    }
    void ShowDetail()
    {
        System.out.println("the Deck name is " + this.deckName);
        System.out.println("Your Cards are");
        for (Cards c : cards)
        {
            c.ShowDetail();
        }
    }

}
