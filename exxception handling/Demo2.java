class Demo{
    public static void main(String[] args)
    {    try
        {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a/b;
        System.out.println(c);
       }
       
       catch(ArithmeticException e1)
       {
        System.out.println("divide by zero");
       }
       catch(NumberFormatException e2)
       {
        // e.printStackTrace();
        System.out.println("enter an integer ");
       }
       catch(ArrayIndexOutOfBoundsException e3)
       {
        // e.printStackTrace();
        System.out.println("array index not found ");
       }
       catch(Exception e)//generic class block
       {
        e.printStackTrace();
       }

    }
}
