import java.util.*;
class Demo
{
    public static void main(String[] args) {
        
        ArrayList list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

       

        //for printind
        Iterator itr=list.iterator();
        // itr.remove();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}