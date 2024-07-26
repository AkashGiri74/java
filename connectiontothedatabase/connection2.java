import java.sql.*; // Import the JDBC package, which contains the necessary classes for database access

class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection to the database
        // The URL format is jdbc:mysql://<hostname>:<port>/<database>
        // "root" is the username and "747288" is the password
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "root", "747288");

        // Check if the connection was successful
        if (con != null) {
            // Print success message if the connection is established
            System.out.println("Connection successful");
        } else {
            // Print failure message if the connection is not established
            System.out.println("Connection not successful");
            return; // Exit the method if connection failed
        }

        // Create a statement object to send SQL queries to the database
        Statement stmt = con.createStatement();

        // Execute a query to retrieve all records from the Employees table
        // The result of the query is stored in the ResultSet object
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

        // Process and print the result set
        while (rs.next()) { // Loop through each row of the result set
            // Retrieve data from the current row by column name
            int employeeID = rs.getInt("EmployeeID"); // Get EmployeeID from the current row
            String lastName = rs.getString("LastName"); // Get LastName from the current row
            String firstName = rs.getString("FirstName"); // Get FirstName from the current row
            Date birthDate = rs.getDate("BirthDate"); // Get BirthDate from the current row
            Date hireDate = rs.getDate("HireDate"); // Get HireDate from the current row
            double salary = rs.getDouble("Salary"); // Get Salary from the current row

            // Print the current row data
            System.out.println("EmployeeID: " + employeeID +
                               ", LastName: " + lastName +
                               ", FirstName: " + firstName +
                               ", BirthDate: " + birthDate +
                               ", HireDate: " + hireDate +
                               ", Salary: " + salary);
        }

        // Close the ResultSet, Statement, and Connection objects to free up resources
        rs.close(); // Close the ResultSet object
        stmt.close(); // Close the Statement object
        con.close(); // Close the Connection object
    }
}

