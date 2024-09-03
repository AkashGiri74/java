import  java.util.*;
class Student implements Comparable<Object>
{
    int rollNO;
    String name;
    String mobileNo;


    Student(int rollNO,String name,
    String mobileNo)
   { this.rollNO=rollNO;
    this.name=name;
        this.mobileNo=mobileNo;
    }

    
    public int compareTo(Object  obj)
    {   Student s=(Student)obj;
        int result=0;  
         try{

         result=(new Integer(this.rollNO)).compareTo(s.rollNO); 
         
         }
         catch(ClassCastException cc){
          cc.printStackTrace();
         }
         return result;
    }

    @Override
    public String toString() {
        return this.rollNO  +" "+ this.name+" " +" "+ this.mobileNo;
    }

    


}
class  Demo{
    public static void main(String[] args) {
         TreeSet ts=new TreeSet<>();
         ts.add(new Student(10, "akash", "8010236068"));
         ts.add(new Student(12, "akasha", "80102362068"));
         ts.add(new Student(43, "akasha", "80102361068"));
         ts.add(new Student(145, "akasssh", "80310236068"));
         ts.add(new Student(14, "akashd", "80103236068"));

         System.out.println(ts);
    }
}
