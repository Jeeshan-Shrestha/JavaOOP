package RuntimePolymorphism;
import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dog or cat");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("DOG"))
        {
            Animals dog = new Dog();
            dog.Speak();
        }
        else if (userInput.equalsIgnoreCase("CAT"))
        {
            Animals cat = new Cat();
            cat.Speak();
        }
        else
        {
            System.out.println("Not a valid entry");
        }

    }
}
