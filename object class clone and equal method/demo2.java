class demo1 
{   
    int a,b;
    // demo(int a,int b)
    // {
    //     this.a=a;
    //     this.b=b;
    // }
    public boolean equals(Object obj)
    {   demo dref=(demo)obj;
        return
        this.a==dref.a && this.b==dref.b; 
    }
    public static void main(String args[])
    {
        demo d1=new demo(10,20);
        demo d2=new demo(10,20);

        System.out.println((d1).equals(d2));
        System.out.println(d1==d2);
        Integer iref1=10000;
        Integer iref2=10000;

        System.out.println(iref1==iref2);


    }
}

class test extends demo1
{  int a,b;
     test(int a,int b)
    
    {
        this.a=a;
        this.b=b;
    }

   public static void main(String[] args)
    {
    demo d1=new demo(10,20);
    test t1=new test(10,20);
    System.out.println(d1.equals(t1));
   }
}
