
class Demo {
    int a, b, c;

    Demo(int a,int b,int c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Demo[] d = new Demo[]{ new Demo(10, 20, 30),new Demo(0, 0, 0)};

        // for(int i=0;i<5;i++)
        // {
        //     d[i]=new Demo(1,2,3);
        // }
        
        
        System.out.println(d[0].a);
        System.out.println(d[1].a);
        System.out.println(d[2].a);
    }
}
