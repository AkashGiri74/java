import  java.util.*;
class Demo
{

   public static void main(String[] args)
   {   
       //add
    //    public void add(int index,object obj)
    //    {
        
    //    }
        ArrayList al=new ArrayList<>();
        al.add("AAA"); 
        al.add("BBB"); 
        al.add("CCC"); 
        al.add("DDD"); 
        al.add("DDD"); 
        al.add("DDD"); 
        System.out.println(al);
        al.add(2,"EEE");

        System.out.println(al);
        //addAll

        //    public void addAll(int index,object obj)
    //    {
        
    //    }
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);

        al.addAll(2,hs);
        System.out.println(al);

        //set

        //    public object set(int index,object obj)
    //    {
        
    //    }
    ArrayList al2=new ArrayList<>();
    al2.add(new Demo()); 
    al2.add(new Demo()); 
    al2.add(new Demo()); 
    al2.add(new Demo()); 
    // System.out.println(al2);
      
             System.out.println(al2.set(2, hs));
             //why data is printing
             //becuase string class overide toString method of object class 

             System.out.println(al2);


             //get

           System.out.println(al.get(2));  

           //remove
           System.out.println(al.remove(2)); 
           al.remove(2); 
           System.out.println(al);

           //indexOf-first occurance

           System.out.println(al.indexOf("AAA"));
           System.out.println(al.lastIndexOf("CCC"));

           int index=al.indexOf("BBB");
           int index1=al.lastIndexOf("DDD");
           //to object shevti kontya index varr ala 

           System.out.println(index);
           System.out.println(index1);
        


        
   }
}




