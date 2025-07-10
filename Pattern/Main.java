package Pattern;
public class Main {
    public static void main(String[] args)
    {
        RectangularPattern('*');
        System.out.println();
        HollowRectanglePattern('*');
        System.out.println();
        HalfPyramid('*');
        System.out.println();
        ReverseHalfPyramid('*');
        System.out.println();
        TabbedPyramid('*');
        System.out.println();
        NumberPyramid();
        System.out.println();
        TabbedNumberPyramid();
        System.out.println();
        myTabbedPyramid();
        System.out.println();
        ReverseNumberPyramid();
        System.out.println();
        ContinuosNumberPyramid();
        System.out.println();
        BinaryTriangle();
        System.out.println();
        ButterflyPattern('*');
        System.out.println();
        SolidRhombus('*');
        System.out.println();
        UglyAssPyramidNumber();
        System.out.println();
        PalindromeNumberPyramid();
        System.out.println();
        DiamondAstering('*');
        System.out.println();
    }
    static void RectangularPattern(char symbol)
    {
        /* *****
           *****
           *****
           ***** lets print this
         */
        for (int i = 0 ; i < 4 ; i++)
        {
            for (int j = 0 ; j < 5 ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    static void HollowRectanglePattern(char symbol)
    {
        for (int i = 0 ; i < 5 ; i++)
        {
            for (int j = 0 ; j < 10 ; j++)
            {
                if (i == 0 || j == 0 || i == 4 || j ==9)
                    System.out.print(symbol);
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
    static void HalfPyramid(char symbol)
    {
        for (int i = 0 ; i < 5 ; i++)
        {
            for (int j = 0 ; j < i ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    static void ReverseHalfPyramid(char symbol)
    {
        for (int i = 5 ; i > 0 ; i--)
        {
            for (int j = 0 ; j < i ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    static void TabbedPyramid(char symbol)
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= (5 - i); j++)
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    static void NumberPyramid()
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j<= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void TabbedNumberPyramid()
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j<= (5 - i) ; j++)
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j<= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void myTabbedPyramid()
    {
        for (int i = 1 ; i <= 5 ; i++ )
        {
            for (int j = 1 ; j<=(5-i); j++)
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j<= i; j++)
            {
                System.out.print(i);

            }
            System.out.println();

        }
    }
    static void ReverseNumberPyramid()
    {
        for (int i = 5 ; i >=1 ; i--)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void ContinuosNumberPyramid()
    {
        int temp = 1;
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j<= i ; j++)
            {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }
    static void BinaryTriangle()
    {
        for (int i = 1; i<= 5 ; i++)
        {
            for (int j = 1 ; j<= i ; j++)
            {
                if ((i+j) % 2 == 0 )
                {
                    System.out.print(1);
                }
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
    static void ButterflyPattern(char symbol)
    {
        for (int i = 1 ; i <= 4 ; i ++)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(symbol);
            }
            for (int j = 1 ; j <= (8-(i*2))  ; j++) //spaces
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (int i = 4 ; i >= 0 ; i --)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(symbol);
            }
            for (int j = 1 ; j <= (8-(i*2))  ; j++) //spaces
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    static void SolidRhombus(char symbol)
    {
        for (int i = 1 ; i <= 5; i++)
        {
            for (int j = 1 ; j <= (5 - i); j++)
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j<= 5 ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    static void UglyAssPyramidNumber()
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= (5-i) ; j++)
            {
                System.out.print(' ');
            }
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void PalindromeNumberPyramid()
    {
        for (int i = 1 ; i<= 5 ; i++)
        {
            for (int j = 1 ; j<=(5 - i) ; j++)
            {
                System.out.print(' ');
            }
            for (int j = i; j>=1 ;j--)
            {
                System.out.print(j);
            }
            for (int j = 2 ; j<= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void DiamondAstering(char symbol)
    {
        for (int i = 1; i<= 4 ; i++)
        {
            for (int j = 1 ; j<= (4-i); j++)
            {
                System.out.print(' ');
            }
            for (int j = i ; j>= 1; j--)
            {
                System.out.print(symbol);
            }
            for (int j = 2 ; j<=i; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (int i = 4; i>= 1 ; i--)
        {
            for (int j = 1 ; j<= (4-i); j++)
            {
                System.out.print(' ');
            }
            for (int j = i ; j>= 1; j--)
            {
                System.out.print(symbol);
            }
            for (int j = i; j>=2 ; j--)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
