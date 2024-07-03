// Engine class
class Engine {
     String type;

     Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Car class using composition
class Car
 {
    Engine engine;

    Car(String engineType) 
    {
        this.engine = new Engine(engineType);
    }

     String getEngineType() 
    {
        return engine.getType();
    }

    public static void main(String[] args) 
    {
        Car myCar = new Car("V8");
        System.out.println("My car's engine type: " + myCar.getEngineType());
    }
}
