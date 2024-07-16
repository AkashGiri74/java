class Demo{

    public static void main(String[] args) 
    {
        Demo d=new Demo();
        // d.fun(a);
        int a=Integer.parseInt(args[0]);
        d.fun(a);
    }
        int fun(int a)
    {
        try
        {    System.exit(0); //forcefully exit finnally
            // int a=Integer.parseInt(args[0]);
            try
            {
            int[] arr=new int[a];
          
            }
            catch(NegativeArraySizeException nae)
            { 
            System.out.println("array index is negative");
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
       }
        catch(NumberFormatException e2)
       {
        System.out.println("enter an integer ");
       }
       catch(ArrayIndexOutOfBoundsException e3)
       {
        System.out.println("array index not found ");
       }
       catch(Exception e)
       {
         e.printStackTrace();
       }
       finally
       {
    
        System.out.println("this is always executed ");
        return 10;
       }  
    }
}
