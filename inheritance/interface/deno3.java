 interface demo
{
   default void fun()
   {
   System.out.println("default function ");
   }   
   static void fun1()
   {
    System.out.println("static func ");
   } 
}

class test implements demo
{

}

class abstractiondemo 
{
    public static void main (String args[])
    {
        test t =new test();
        t.fun();
        demo.fun1();
    }
}


