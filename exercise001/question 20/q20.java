/*20. Write a Java program to define an interface Animal with methods 
eat and sleep. Implement this interface in classes Lion and Cow. */
// Animal interface
interface Animal
 {
    void eat();
    void sleep();
}


class Lion implements Animal 
{
    
    public void eat() 
    {
        System.out.println("Lion eats meat.");
    }

    
    public void sleep() 
    {
        System.out.println("zzzzz++++");
    }
}


class Cow implements Animal {
    
    public void eat()
     {
        System.out.println("Cow eats grass.");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzz");
    }
}

class demo
 {
    public static void main(String[] args)
     {
        Lion lion = new Lion();
        Cow cow = new Cow();

        lion.eat();
        lion.sleep();

        cow.eat();
        cow.sleep();
    }
}
