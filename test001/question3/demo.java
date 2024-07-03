/*What is Encapsulation in Java? Explain with an example */
 class person
{ private int age;
  private String name;
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public int getAge()
  {
    return age;
  }
  public void setAge(int age)
  {
    this.age=age;
  }

}
public class demo
{
  public static void main(String[] args) {
    person p1=new person();
    p1.setName("akash");
    System.out.println("name:"+p1.getName());
    p1.setAge(20);
    System.out.println("age:"+p1.getAge());

  }
}

