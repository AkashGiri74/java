/*14. Write a Java program demonstrating single inheritance by creating 
a class Person with properties name and age, and a subclass 
Employee with additional property employeeId.*/
class Person
{
    String name;
    int age;

    Person(String name,int age )
    { this.name=name;
        this.age=age;

    }
}
class Employee extends Person
{   int employeeId;
    Employee(String name,int age,int employeeId)
    {
        super(name,age);
        this.employeeId=employeeId;
    }
    void dispalyEmpDetails()
    {
        System.out.println("name "+super.name);
        System.out.println("age "+super.age);
        System.out.println("ID "+employeeId);
    }
}
class demo
{
    public static void main(String args[])
     {
       Employee emp1=new Employee("Akash",21,123);
       emp1.dispalyEmpDetails();

    }
}