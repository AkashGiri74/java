
class outer1
{    int a=10;
    class inner1
    {  /*static*/ int b=20;
        void func()
        {
            System.out.println("inner func "+a);
        }
    }

    void gun ()
    {
        inner1 iref=new inner1();
        iref.func();

        // System.out.println(b);//error 

        inner1 ireff1=new inner1();
        System.out.println(ireff1.b);
    }


        public static void main(String[] args) {
        outer1 oref=new outer1();
        oref.gun();
        

    }
}