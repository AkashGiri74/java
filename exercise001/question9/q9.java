/*9. Write a java program to create abstract class Shape with abstract 
methods calculateArea and calculatePerimeter. Extend this class to 
create Circle and Rectangle classes and implement the abstract 
methods. */
abstract class shape
{
    abstract void calArea();
    abstract void calPerimeter();

}
class Circle extends shape
{   int radius;
    Circle(int radius)
    {
     this.radius=radius;
    }

    void  calArea()
    {
    System.out.println("area of circle "+ Math.PI *radius *radius) ;
    }
    void calPerimeter()
    {
   System.out.println("perimeter of circle "+2 * Math.PI * radius);
    }

}
class Rectangle extends shape
{   int length;
    int width;
    Rectangle(int length, int  width) {
        this.length = length;
        this.width = width;
    }
    void calArea()
    {
   System.out.println("area of rectangle "+length * width);
    }
    void calPerimeter()
    {
       System.out.println("perimeter of rectangle "+2 * (length + width)); 
    }

}
class demo 
{
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.calArea();
        circle.calPerimeter();

        Rectangle rectangle=new Rectangle(2,3);
        rectangle.calArea();
        rectangle.calPerimeter();
        
    }
}