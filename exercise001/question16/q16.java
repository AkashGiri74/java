class Person {
    protected String name;

    protected Person(String name)
     {
        this.name = name;
    }

    protected void introduce()
     {
        System.out.println("Hi, I'm " + name);
    }
}

class Employee extends Person {
    int employeeId;

    public Employee(String name, int employeeId) 
    {
        super(name);
        this.employeeId = employeeId;
    }

    protected void introduce()
     {
        super.introduce(); // Call the overridden method from the superclass
        System.out.println("Employee ID: " + employeeId);
    }
}

class demo {
    public static void main(String[] args) {
        Employee emp = new Employee("Akash", 101);
        emp.introduce(); // Calls the overridden introduce() method
    }
}
