public class Quadrilateral
{
    private Point p1;
    private Point p2;

    public Quadrilateral(Point p1, Point p2)
    {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public double area()
    {
        return (p2.getX() - p1.getX()) * (p1.getY() - p2.getY());
    }

    public boolean isSquare()
    {
        if (p1.getX() == p2.getX())
        {
            if (p1.getY() == p3.getY())
                return p1.distance(p2) == p1.distance(p3);
            return p1.distance(p2) == p2.distance(p3);
        }

        if (p1.getY() == p2.getY())
            return
    }

    public Point getPoint1()
    {
        return new Point(p1);
    }

    public Point getPoint2()
    {
        return new Point(p2);
    }

    public void setPoint1(Point newP1)
    {
        this.p1 = new Point(newP1);
    }

    public void setPoint2(Point newP2)
    {
        this.p2 = new Point(newP2);
    }

    @Override
    public String toString()
    {
        return "The points are: \n\tA: " + p1.toString() + "\n\tB: " + p2.toString() + "\n\tC: " +
                p3.toString() + "\n\tD: " + calculateTheFourthPoint().toString();
    }

    private Point calculateTheFourthPoint()
    {
        // this function is assuming that the Quadrilateral is a square or a rectangle.
        if (p1.getX() == p2.getX())
        {
            if (p1.getY() == p3.getY())
                return new Point(p3.getX(), p2.getY());
            return new Point(p3.getX(), p1.getY());
        }

        if (p1.getY() == p2.getY())
            return new Point(p2.getX(), p3.getY());
        return new Point(p1.getX(), p2.getY());
    }
}
