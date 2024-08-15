import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/user";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Nitesh123@#$";
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
       response.setContentType("text/html");   
       PrintWriter out= response.getWriter();
       String uname =request.getParameter("username");             
       String pass=request.getParameter("password");    
       
       
       if (validateUser(uname, pass))
       {          
          RequestDispatcher rd=request.getRequestDispatcher("/carbooking.jsp");          
          rd.forward(request, response);    
       }     
       else
       {               
          RequestDispatcher gd=request.getRequestDispatcher("login.jsp");          
          gd.include(request, response);  
          out.println("Your Data is Not in The database Please register yourself first Or maybe you have entered wrong password"); 
       } 
    }
       private boolean validateUser(String uname, String pass) {
        boolean isValid = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare the SQL query
            String sql = "SELECT * FROM newuser WHERE username = ? AND password = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, uname);
            stmt.setString(2, pass);

            // Execute the query
            rs = stmt.executeQuery();

            // Check if the user exists
            if (rs.next()) {
                isValid = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        return isValid;
     }
}
    


