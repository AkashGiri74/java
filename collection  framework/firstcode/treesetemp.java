import  java.util.*;
class Employee implements Comparable<Object>
{
    int e_id;
    String name;
    String mobileNo;


    Employee(int eid,String name,
    String mobileNo)
   { this.e_id=eid;
    this.name=name;
        this.mobileNo=mobileNo;
    }

    
    public int compareTo(Object  obj)
    {   Employee e=(Employee)obj;
        int result=0;  
         try{

         result=(new Integer(this.e_id)).compareTo(e.e_id); 
         
         }
         catch(ClassCastException cc){
          cc.printStackTrace();
         }
         return result;
    }

    @Override
    public String toString() {
        return this.e_id  +" "+ this.name+" " +" "+ this.mobileNo;
    }

    


}
class  Demo{
    public static void main(String[] args) {
         TreeSet ts=new TreeSet<>();
         ts.add(new Employee(10, "akash", "8010236068"));
         ts.add(new Employee(12, "akasha", "80102362068"));
         ts.add(new Employee(43, "akasha", "80102361068"));
         ts.add(new Employee(145, "akasssh", "80310236068"));
         ts.add(new Employee(14, "akashd", "80103236068"));

         System.out.println(ts);
    }
}

