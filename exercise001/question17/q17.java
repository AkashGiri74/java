
/*
17. Write a Java to Create an example of method overriding in Java 
where the subclass method calls the superclass method using the 
super keyword.
*/class Animal 
{
    void makeSound()
     {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
 {
    
    void makeSound() 
    {
        super.makeSound();
        System.out.println(" dogs make bhoooo bhoooo");
    }
}

class demo {
    public static void main(String[] args)
     {
        Dog myDog = new Dog();
        myDog.makeSound(); 
    }
}
