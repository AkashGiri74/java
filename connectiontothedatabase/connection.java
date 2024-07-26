
import java.sql.*;
class Demo
{
    public static void main(String[] args)throws ClassNotFoundException,SQLException
     {
    //   Class.forName("com.mysql.cj.jdbc.Driver");
      //we need to load com.mysql.cj.jdbc.Driver class to load classes


      // Class.forName("com.mysql.jdbc.Driver");   this will also work why ?  
      
        /*-->

Great question! The reason both Class.forName("com.mysql.cj.jdbc.Driver") and
 Class.forName("com.mysql.jdbc.Driver") work is due to backward compatibility.

Here’s a bit more detail:

com.mysql.jdbc.Driver: This was the driver class used in older versions of the MySQL Connector/J. 
If you’re using an older version of the MySQL JDBC driver, this class will be loaded.
com.mysql.cj.jdbc.Driver: This is the driver class used in newer versions of the MySQL Connector/J 
(starting from version 8.0). The cj stands for “Connector/J”.
When you use Class.forName("com.mysql.jdbc.Driver"), 
the MySQL Connector/J library internally redirects it to com.mysql.cj.jdbc.Driver
 if you’re using a newer version of the driver*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        //we need to load com.mysql.cj.jdbc.Driver class to load classes
        Connection con=null;//connection is a interface 
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","747288");
            //we can't create object of the interface  
            //we uses upcasting techniques of DriverManager class and then use getConnection method
           
           
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

// import java.sql.*;

// class Demo {
//     public static void main(String[] args) {
//         try {
//             // Load the MySQL JDBC driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish a connection to the database
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/mydatabase", "root", "747288"
//             );

//             // Create a statement object
//             Statement stmt = con.createStatement();

//             // Print the statement object to confirm it's created
//             System.out.println(stmt);

//             // Check if the connection is successful
//             if (con != null) {
//                 System.out.println("Connection successful");
//             } else {
//                 System.out.println("Connection not successful");
//             }

//             // Close the connection
//             con.close();

//         } catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Connection failed");
//             e.printStackTrace();
//         }
//     }
// }

