class Demo
{
    public static void main(String[] args) {
        int a=10,b=0;
    
        try
          {
            int c =a/b;
        System.out.println(c);
        // System.out.println("hello");
       
        }

        catch(ArithmeticException ae)
        {
            // System.out.println("hello");
        System.out.println(ae.getMessage());//descrpition
        System.out.println();
        System.out.println(ae.toString());//class description
        System.out.println();
        ae.printStackTrace();//class description location
        // return 0;
          }
          System.out.println("hello");
    }
}