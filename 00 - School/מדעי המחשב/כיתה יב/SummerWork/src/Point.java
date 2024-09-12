public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point other)
    {
        this.x = other.x;
        this.y = other.y;
    }

    public double distance(Point p)
    {
        return Math.sqrt(
                Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2)
        );
    }

    public int ravia()
    {
        if (this.x > 0)
        {
            if (this.y >= 0)
                return 1;
            return 4;
        }
        else if (this.x < 0)
        {
            if (this.y >= 0)
                return 2;
            return 3;
        }

        return 0;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double newX)
    {
        x = newX;
    }

    public void setY(double newY)
    {
        y = newY;
    }

    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
