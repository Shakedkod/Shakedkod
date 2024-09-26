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
        return (p2.getX() - p1.getX()) == (p1.getY() - p2.getY());
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
        return "The points are: \n\tA: " + p1.toString() + "\n\tB: " + calculatePointB().toString() + "\n\tC: " +
                calculatePointC().toString() + "\n\tD: " + p2.toString();
    }

    private Point calculatePointB()
    {
        return new Point(p2.getX(), p1.getY());
    }

    private Point calculatePointC()
    {
        return new Point(p1.getX(), p2.getY());
    }
}
