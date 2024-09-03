import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class Demo
{
    public static void main(String[] args)
    {   
        TreeSet ts=new TreeSet<>();
           ts.add(45);
           ts.add(4);
           ts.add(5);
           ts.add(145);
           ts.add(425);

       
          //constuctors of priority queue
         //default construcor
        PriorityQueue qe=new PriorityQueue<>();
        qe.offer(10);
        qe.offer(20);
        qe.offer(34);
        qe.offer(4);
        qe.offer(0);//add element in queue 

        System.out.println(qe);
         // PriorityQueue(int capacity)
        qe=new PriorityQueue<>(5);
        qe.offer(10);
        qe.offer(20);
        qe.offer(34);
        qe.offer(4);
        qe.offer(0);

        System.out.println(qe);
         // PriorityQueue(sortedset ss)
        qe=new PriorityQueue<>(ts);
        qe.offer(10);
        qe.offer(20);
        qe.offer(34);
        qe.offer(4);
        qe.offer(0);

        System.out.println(qe);

          // PriorityQueue(PriorityQueue pq)
        qe=new PriorityQueue<>(qe);
        qe.offer(10);
        qe.offer(20);
        qe.offer(34);
        qe.offer(4);
        qe.offer(0);

        System.out.println(qe);

        ArrayList al=new ArrayList<>();
         al.add(90);
         al.add(20);   
         al.add(50);
         al.add(120);
        // PriorityQueue(Collecton c)
        qe=new PriorityQueue<>(al);
        qe.offer(10);
        qe.offer(20);
        qe.offer(34);
        qe.offer(4);
        qe.offer(0);

        System.out.println(qe);



        //methods of queue
        System.out.println(qe.poll());//empty asel return null
        System.out.println(qe.remove());//excpetion if empty 
        System.out.println(qe.peek());//tell first element null if empty
        System.out.println(qe.element());//returns exception if empty


         //bounded queueu 
        ArrayBlockingQueue bq=new ArrayBlockingQueue(11) ;
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(10);
        bq.offer(30);
        bq.offer(20);
        System.out.println(bq);




          //dqueue (i)
        ArrayDeque adq=new ArrayDeque();
        adq.addFirst(90);
        adq.addLast(23);
        adq.addLast(bq);

        System.out.println(adq);


        System.out.println(adq.removeFirstOccurrence(adq));
        System.out.println(adq.removeLastOccurrence(adq));

        
            
    
    }
}