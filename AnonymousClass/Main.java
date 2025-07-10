package AnonymousClass;

public class Main
{
    public static void main(String[] args)
    {
        Human human = new Human();
        human.Speak();

        Human human1 = new Human(){
            @Override
            void Speak()
            {
                System.out.println("this nigga is speaking");
            }
        };
        human1.Speak();
    }
}
