class demo5 implements Cloneable
{
    public demo5 clone() throws CloneNotSupportedException
    {
       return (demo5)super.clone();
    }

    int a,b;
    demo5(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
   
    
}
class test2 
{   public static void main(String[] args) 
    {
        demo5 d1=new demo5(10, 20);
        // demo4 d2=d1 ;
        demo5 d2=(demo5)d1.clone();
        System.out.println(d1==d2);
        d1.a=50;
        System.out.println(d1.a);
        System.out.println(d2.a);
        d1.a=20;
        System.out.println(d1.a);
        System.out.println(d2.a);

    }
}
