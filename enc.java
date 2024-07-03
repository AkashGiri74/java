 class student 
 {  private int age ;

     public void set_age(int age)
     {  if(age >=21)
        System.out.println("student is eligible for competitive ");
        this.age=age;
     }
    public int get_age()
    {
        return this.age;
    }


}
class age
{ 
    public static void main(String args[]) 
    {
        student s1=new student();
        s1.set_age(21);

        System.out.println(s1.get_age());


        
    }

}
