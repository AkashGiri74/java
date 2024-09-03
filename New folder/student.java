import java.util.*;
import java.util.function.ToDoubleBiFunction;
public class student {

    int rollNO;
    String name;


    student(int id,String name)
    {
        this.rollNO=id;
        this.name=name;
    }

      public static void main(String[] args) {
          
      
        student sb1 = new student(12,"ccc");
       student  sb2 = new student(34,"aaaa");

     TreeSet ts = new TreeSet<>(new MyComparator());

        ts.add(sb1);
        ts.add(sb2);
        System.out.println(ts);

      }

    @Override
    public String toString() {
        return this.rollNO+this.name;
    }
     
    
}

class MyComparator implements java.util.Comparator {
    public int compare(Object obj1,Object obj2)

     {  student sb1=(student)obj1;
        student sb2=(student)obj2;
        if (sb1.name.length() == sb2.name.length()) 
        {
            return 0;
        } else if (sb1.name.length() > sb2.name.length()) {
            return 1;
        } else {
            return -1;
        }
    }
}
