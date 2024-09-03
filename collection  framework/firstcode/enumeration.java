import java.util.*;
class Demo
{
    public static void main(String[] args) {
          

        Vector v=new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(80);
        v.addElement(76);
        v.addElement(34);

        Enumeration e=v.elements();

        System.out.println(e.getClass().getName());

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

    }
}
