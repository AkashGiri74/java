
import java.util.SortedSet;
import java.util.TreeSet;

class Demo{
    public static void main(String[] args) 
    {
     SortedSet ss=new TreeSet<>();
     ss.add("bbb");    
     ss.add("aaa");    
     ss.add("ddd");    
     ss.add("ccc");    
     ss.add("eee");   
     ss.add("eee");   
     System.out.println(ss); 
     System.out.println(ss.first()); 
     System.out.println(ss.last()); 
     System.out.println(ss.subSet("bbb","ddd")); //subaser bb and ccc ,adhale 1st include
    //  System.out.println(ss.subSet("ddd","bbb"));//exception 
     System.out.println(ss.headSet("ddd")); //jo denar typeksha lahan
     System.out.println(ss.tailSet("ddd")); //denar to ani tyapeksha mothe element
     System.out.println(ss); 



      ss=new TreeSet<>();
     ss.add(new StringBuffer("bbb"));    
     ss.add(new StringBuffer("aaa"));    
     ss.add(new StringBuffer("ddd"));    
     ss.add(new StringBuffer("ccc"));    
     ss.add(new StringBuffer("eee")); 
     System.out.println(ss); 
     
     //gives exception

     ss=new TreeSet<>();
     ss.add(new String("bbb"));    
     ss.add(new String("aaa"));    
     ss.add(new String("ddd"));    
     ss.add(new String("ccc"));    
     ss.add(new String("eee")); 
     ss.add(new String("eee")); 
     //its not give exception
     System.out.println(ss); 
     //yacha artha kay ? 
    // StringBuffer is not implements comparable 
    // string is implements comparable


     
    }
}