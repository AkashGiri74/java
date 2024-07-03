class demo
{
    int a,b,c;

    demo(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String toString()
    {
      return  this.a+" "+ this.b + " "+ this.c;
    }

    // public static void main(String[] args)
    // {
    //     demo d1=new demo(10,20,30);
    //     System.out.println(d1.toString());
    //     demo d2=new demo(40,50,60);
    //     System.out.println(d2.toString());
    //     demo d3=new demo(70,80,90);
    //     System.out.println(d3.toString());
    // }
}
class test
{
    public static void main(String[] args)
    {
        demo d1=new demo(10,20,30);
        System.out.println(d1.toString());
        demo d2=new demo(40,50,60);
        System.out.println(d2.toString());
        demo d3=new demo(70,80,90);
        System.out.println(d3.toString());
    }

}