class emp
{
    void calSalary()
    {
        System.out.println("emp salary");
    }
}

class demo
{
    public static void main(String[] args) {
       emp akash=new emp()
       {
          void calSalary()
          {
            System.out.println("akash salary");
          }

       }; 
       akash.calSalary();
       


    }
}
