import  java.util.*;
class Demo
{

   public static void main(String[] args)
   {
       


        HashSet hs=new HashSet();
        hs.add("AAA"); 
        hs.add("BBB"); 
        hs.add("CCC"); 
        hs.add("DDD"); 
       


        ArrayList al=new ArrayList<>();
        al.add("AAA"); 
        al.add("BBB");
        al.add("XXX");
        al.add("ZZZ");
        System.out.println(al.retainAll(hs));//true
        System.out.println(al);
        //hs thev bakiche delete
       //delele thwv bakiche delete krr
        //public boolean retainAll(Object obj)
        //{

        //}//its return true or false
   }
}


