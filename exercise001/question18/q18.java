/*18. Write a Java program that uses the super keyword to call the 
superclass constructor and superclass methods from a subclass */

class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String species, String breed) {
        super(species); // Call the superclass constructor
        this.breed = breed;
    }

    void displayDogInfo() 
    {
        System.out.println("Species: " + species);
        System.out.println("Breed: " + breed);
        makeSound(); 
    }
}

class demo
{
    public static void main(String[] args)
     {
        Dog myDog = new Dog("streetdog", "xyz");
        myDog.displayDogInfo();
    }
}
