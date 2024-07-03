class mobile_user
{
    public static void main(String args[]) 
    {  mobile oneplus=new mobile();
          oneplus.insert_sim(new jio());
          
        
    }
}

class mobile
{

    void insert_sim(sim s)
    {
        System.out.println("sim insert success ");
        s.calling();
        s.sms();
    }
}

interface sim
{
   void calling();

   void sms();

}

class jio implements sim
{    
    
    public void calling()
    {
    System.out.println("sim calling");
    }
   public void sms()
   {
    System.out.println("sim sms");
   }

}