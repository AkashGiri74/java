/*2. Write a Java to Create an example of method overriding in Java where the subclass
method calls the superclass method using the super keyword. */
class vehicle
{
   void startEngine ()
   {
    System.out.println("vehicle engine start");
   }
}
class car extends vehicle
{
    void startEngine()
    {
        super.startEngine();
        System.out.println("car engine start");
    }
}
class demo
{
    public static void main(String[] args) {
        car c1= new car();
        c1.startEngine();
    }
}