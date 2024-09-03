import java.util.*;

class Employee implements Comparable<Employee> {
    int emp_id;
    String name;

    Employee(int id, String name) {
        this.emp_id = id;
        this.name = name;
    }


    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.emp_id, otherEmployee.emp_id);
    }

    
    public String toString() {
        return this.emp_id + " " + this.name;
    }
}

class Demo {
    public static void main(String[] args) {
        TreeSet<Employee> t = new TreeSet<>();
        t.add(new Employee(10, "Akash"));
        System.out.println(t); // Prints the sorted set
    }
}
