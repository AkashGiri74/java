import java.util.*;
class  Demo
{


    public static void main(String[] args)
    {
         HashSet hs=new HashSet<>();
        hs.add(10);  
        hs.add(20);  
        hs.add(90);  
        hs.add(40);  
        System.out.println(hs);


        LinkedHashSet ls=new LinkedHashSet();
        ls.add(20);  
        ls.add(90);  
        ls.add(10);  
        ls.add(40);  
        System.out.println(ls);
    }
}








