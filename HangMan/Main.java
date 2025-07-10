package HangMan;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        Random random = new Random();
        String randomWord;
        String lineReader;
        char userGuess;
        try(Scanner scanner = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new FileReader("Hangman\\Words.txt")))
        {
            while ((lineReader = reader.readLine()) != null)
            {
                words.add(lineReader);
            }
            randomWord = words.get(random.nextInt(11));
            ArrayList<Character> guessWord = new ArrayList<>();
            for (int i = 0 ; i < randomWord.length() ; i++)
            {
                guessWord.add('_');
            }
            int wrongGuesses = 0;
            System.out.println("Welcome to the HangMan game");
            System.out.println("Guess the letter");
            System.out.print("Guess : ");
            for (int i = 0; i < randomWord.length(); i++)
            {
                System.out.print(guessWord.get(i) + " ");
            }
            while (wrongGuesses < 6)
            {
                if (!guessWord.contains('_'))
                {
                    System.out.println();
                    System.out.println("YOU WON");
                    break;
                }
                System.out.println();
                String input = scanner.nextLine();
                if (input.isEmpty())
                {
                    System.out.println("ENTER SOMETHING");
                    continue;
                }
                userGuess = input.charAt(0);
                if (randomWord.indexOf(userGuess) >= 0)
                {
                    System.out.println("CORRECT");
                    System.out.print("Guess : ");
                    for (int i = 0; i < randomWord.length(); i++)
                    {
                        if (randomWord.charAt(i) == userGuess)
                        {
                            guessWord.set(i,userGuess);
                        }
                        System.out.print(guessWord.get(i) + " ");
                    }


                }
                else
                {
                    wrongGuesses++;
                    System.out.println("WRONG GUESS");
                    DrawHangman(wrongGuesses);
                }
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Type SOMETHING!");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong");
        }
    }
    static void DrawHangman(int wrongGuesses)
    {
        switch (wrongGuesses)
        {
            case 0 -> System.out.println("""
                    
                    
                    
                    """);
            case 1 -> System.out.println("""
                      o
                    
                    
                    """);
            case 2 -> System.out.println("""
                      o
                      |
                    
                    """);
            case 3 -> System.out.println("""
                      o
                     /|\\
                    
                    """);
            case 4 -> System.out.println("""
                      o
                     /|\\
                     /
                    """);
            case 5 -> System.out.println("""
                      o
                     /|\\
                     / \\
                    """);
        }
    }
}
