import java.sql.*;
class Demo
{   public static void main(String[] args)throws ClassNotFoundException,SQLException
    { Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con=null;//connection is a interface 
    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","747288");
        //we can't create object of the interface 

        if(con !=null)
        {
          System.out.println("coonection success");
        }
         else
         {
           System.out.println("not success");
         }  

         Statement stmt=con.createStatement();
       

         ResultSet rs=stmt.executeQuery(" select * from Employees;");
         System.out.println(rs.getInt(1));        
}
} 