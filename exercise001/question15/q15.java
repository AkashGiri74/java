/*15. Write a Java program to demonstrate multilevel inheritance by 
creating a class Vehicle, extending it with Car, and further 
extending Car with ElectricCar */
class vehicle
{ 
    void start() 
    {
        System.out.println("Vehicle started");
    }

}
class car extends vehicle
{   void drive()
  {
    System.out.println("Car is driving");
  }
}


class ElectricCar extends car
{
   void getCarInfo()
   {
    System.out.println("Telas is a electric car");
   }
}

class demo
{
    public static void main(String args[])
     {
        ElectricCar tesla=new ElectricCar();
          tesla.getCarInfo();
          tesla.drive();
          tesla.start();
    }
}