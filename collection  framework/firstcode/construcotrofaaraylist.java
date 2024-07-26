import java.util.*;
class Demo
{
    public static void main(String[] args)
    {    //Arraylist()
        java.util.ArrayList list1=new java.util.ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
         //Arraylist(int cap)
        ArrayList list2=new ArrayList<>(20);
        list2.add(30);
        list2.add(50);
        list2.add(60);
        System.out.println(list2);

        //Arraylist(collection c)
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        ArrayList list3=new ArrayList<>(hs);
        System.out.println(list3);
        

    }

}    
