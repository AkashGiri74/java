class parent 
{  void fun()
    {
   System.out.println("parent func");
    }
    void gun()
    {
        System.out.println("parent gun");
    }
    
}
class child extends parent
{
    void fun()
    {
        System.out.println("child func");
    }
    void run()
    {
        System.out.println("child run ");
    }
}
class demo
{
    public static void main(String args[])
     {
        parent pref=new child();
        pref.fun();
        pref.gun();
        // pref.run();
        
    }
}
