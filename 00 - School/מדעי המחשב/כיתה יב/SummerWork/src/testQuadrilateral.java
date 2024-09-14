import java.util.Scanner;

public class testQuadrilateral
{
    public static final Scanner reader = new Scanner(System.in);

    public static Point createPoint()
    {
        System.out.print("Enter the x pos: ");
        double x = reader.nextDouble();

        System.out.print("Enter the y pos: ");
        double y = reader.nextDouble();

        return new Point(x, y);
    }

    public static Quadrilateral createQuadrilateral()
    {
        Point topLeftPoint = createPoint();
        Point bottomRightPoint = createPoint();

        return new Quadrilateral(topLeftPoint, bottomRightPoint);
    }

    public static void fillArrayWithQuadrilaterals(Quadrilateral[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = createQuadrilateral();
        }
    }

    public static boolean isAllSquares(Quadrilateral[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && !arr[i].isSquare())
                return false;
        }
        return true;
    }

    public static boolean isSorted(Quadrilateral[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].area() < arr[i - 1].area())
                return false;
        }
        return true;
    }

    private static void moveArrayFromPoint(Quadrilateral[] arr, int point)
    {
        for (int i = arr.length - 1; i > point; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static void fillArrayWithQuadrilateralsSorted(Quadrilateral[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            Quadrilateral newOne = createQuadrilateral();

            if (i == 0 || newOne.area() >= arr[i - 1].area())
                arr[0] = newOne;
            else
            {
                int j = i;
                while (j > 0 && newOne.area() < arr[j - 1].area())
                    j--;
                moveArrayFromPoint(arr, j);
                arr[j] = newOne;
            }
        }
    }

    public static void printArray(Quadrilateral[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println(arr[i]);
            else
                System.out.println("index " + i + " is null");
        }
    }

    public static void main(String[] args)
    {
        Quadrilateral[] arr = new Quadrilateral[10];
        fillArrayWithQuadrilaterals(arr);

        System.out.println("are all the Quadrilaterals square? " + isAllSquares(arr));
        System.out.println("is the array sorted? " + isSorted(arr));

        fillArrayWithQuadrilateralsSorted(arr);
        printArray(arr);
    }
}