/*10. Write a java program to create abstract class Employee with fields 
name and id, and abstract methods calculateSalary and 
displayDetails. Create subclasses SalariedEmployee and 
HourlyEmployee to implement these methods. */

abstract class Employee
{
     String name;
     int id;

    Employee(String name,int  id )
    {
        this.id=id;
        this.name=name;
    }
    abstract double calculateSalary();
    abstract void displayDetails();

     
}
class SalariedEmployee extends Employee 
{
    double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary)
     {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    
     double calculateSalary() 
     {
        return monthlySalary;
    }

    public void displayDetails()
     {
        System.out.println("Salaried Employee Details:");
        System.out.println("Name: " + super.name);
        System.out.println("ID: " + super.id);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class HourlyEmployee extends Employee
 {
     double hourlyRate;
     int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) 
    {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    double calculateSalary() 
    {
        return hourlyRate * hoursWorked;
    }

    void displayDetails() 
    {
        System.out.println("Hourly Employee Details:");
        System.out.println("Name: " + super.name);
        System.out.println("ID: " + super.id);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
class Main
 {
    public static void main(String args[])
     {
        SalariedEmployee salariedEmp = new SalariedEmployee("akash", 101, 5000.0);
        salariedEmp.displayDetails();
        System.out.println("Monthly Salary: " + salariedEmp.calculateSalary());

        HourlyEmployee hourlyEmp = new HourlyEmployee("akash", 102, 20.0, 40);
        hourlyEmp.displayDetails();
        System.out.println("Weekly Salary: " + hourlyEmp.calculateSalary());
    }
}