class outer
{
    static class inner
    {  static int a=10;
       int b=10; 
        public static void main(String args[])
        {
            System.out.println("static nested inner main ");
        }

        
    }


    public static void main(String args[])
        {
            System.out.println(" outer main ");
            System.out.println(inner.a);
            inner iref=new inner();
            System.out.println( iref.b);
        }
}