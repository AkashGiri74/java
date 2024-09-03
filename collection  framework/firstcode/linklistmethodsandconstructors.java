import java.util.LinkedList;
class Demo
{  public static void main(String[] args) 
    {
          //constructor 
        //   LinkedList();
        LinkedList ll=new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
          

        java.util.ArrayList list=new java.util.ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        // LinkedList(collection c);
        LinkedList ll1=new LinkedList<>(list);
        System.out.println(ll1);

        //methods 
        //   1
        ll1.addFirst(90);
        System.out.println(ll1);
        //   2
        ll1.addLast(89);
        System.out.println(ll1);
        // 3
        ll1.removeFirst();
        System.out.println(ll1);
        // 4
        ll1.removeLast();
        System.out.println(ll1);
        //5
        System.out.println(ll1.getFirst());
        //6
        System.out.println(ll1.getLast());
        
}

}