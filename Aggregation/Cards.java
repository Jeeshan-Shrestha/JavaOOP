package Aggregation;

public class Cards
{
    public String cardName;
    Cards(String cardName)
    {
        this.cardName = cardName;
    }
    void ShowDetail()
    {
        System.out.println(this.cardName+ " is your card");
    }
}
