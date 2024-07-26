class employee 
{ int E_id;
String E_name;
int E_Salary;
String Designation;

employee(int E_id,String E_name,int E_Salary,String Designation)
  {
    this.E_id=E_id;
    this.E_name=E_name;
    this.E_Salary=E_Salary;
    this.Designation=Designation;
    System.out.println("parameterize constructor");
    
  }
}    

class manager extends employee
{    int bonus;
    manager(int E_id,String E_name,int E_Salary,String Designation,int bonus )
    {   
        super(E_id, E_name, E_Salary, Designation);
        
        this.bonus=bonus;
        

    }

    

}
class demo1
{
    public static void main(String args[]) 
    {
     manager m=new manager(11,"akash",20000000,"xyz",100000) ;  
    }
}
