import java.sql.*;

class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection to the database
        // The URL format is jdbc:mysql://<hostname>:<port>/<database>?useSSL=false
        // "root" is the username and "747288" is the password
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "root", "747288");

        // Check if the connection was successful
        if (con != null) {
            System.out.println("Connection successful");
        } else {
            System.out.println("Connection not successful");
            return; // Exit the method if connection failed
        }

        // Create a statement object to send SQL queries to the database
        Statement stmt = con.createStatement();

        // Execute a query to retrieve all records from the Employees table
        // The result of the query is stored in the ResultSet object
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

        // Process and print the result set
        // Move the cursor to the first row of the result set
        if (rs.next()) {
            // Retrieve data by column name
            int employeeID = rs.getInt("EmployeeID"); // Get EmployeeID from the current row
            String lastName = rs.getString("LastName"); // Get LastName from the current row
            String firstName = rs.getString("FirstName"); // Get FirstName from the current row
            Date birthDate = rs.getDate("BirthDate"); // Get BirthDate from the current row
            Date hireDate = rs.getDate("HireDate"); // Get HireDate from the current row
            double salary = rs.getDouble("Salary"); // Get Salary from the current row

            // Print the first row data
            System.out.println("First Row -> EmployeeID: " + employeeID +
                               ", LastName: " + lastName +
                               ", FirstName: " + firstName +
                               ", BirthDate: " + birthDate +
                               ", HireDate: " + hireDate +
                               ", Salary: " + salary);
        }

        // Move the cursor to the second row of the result set
        if (rs.next()) {
            // Retrieve data by column name
            int employeeID = rs.getInt("EmployeeID"); // Get EmployeeID from the current row
            String lastName = rs.getString("LastName"); // Get LastName from the current row
            String firstName = rs.getString("FirstName"); // Get FirstName from the current row
            Date birthDate = rs.getDate("BirthDate"); // Get BirthDate from the current row
            Date hireDate = rs.getDate("HireDate"); // Get HireDate from the current row
            double salary = rs.getDouble("Salary"); // Get Salary from the current row

            // Print the second row data
            System.out.println("Second Row -> EmployeeID: " + employeeID +
                               ", LastName: " + lastName +
                               ", FirstName: " + firstName +
                               ", BirthDate: " + birthDate +
                               ", HireDate: " + hireDate +
                               ", Salary: " + salary);
        }

        // Close the ResultSet, Statement, and Connection objects to free up resources
        rs.close();
        stmt.close();
        con.close();
    }
}


