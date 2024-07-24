import java.util.*;

public class Ex1
{
    static Scanner reader = new Scanner(System.in);

    // Read Int
    public static int NextInt(String message)
    {
        System.out.print(message);
        return reader.nextInt();
    }

    // Read Double
    public static double NextDouble(String message)
    {
        System.out.print(message);
        return reader.nextDouble();
    }

    // Read Char
    public static char NextChar(String message)
    {
        System.out.print(message);
        return reader.next().charAt(0);
    }

    // Math.Random
    public static int Random(int a, int b)
    {
        if (a > b)
            return (int)(Math.random() * (a - b + 1)) + b;

        return (int)(Math.random() * (b - a + 1)) + a;
    }

    // MAIN //
    public static void main(String[] args)
    {

    }
}