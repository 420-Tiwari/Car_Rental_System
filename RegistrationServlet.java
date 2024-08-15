/*import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Arpan
 
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con = null;
        Statement stmt = null;
        String uname = request.getParameter("userName");
        String pwd = request.getParameter("userPass");
        String email = request.getParameter("email");
       /* String email = request.getParameter("userEmail");
        String country = request.getParameter("userCountry");
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "Nitesh123@#$");
            stmt=con.createStatement();
            if (pwd != null && !pwd.trim().isEmpty()) {
            stmt = con.prepareStatement("insert into NewUser values(?, ?, ?)");
            stmt.setString(1, uname);
            stmt.setString(2, email);
            stmt.setString(3, pwd);
            stmt.executeUpdate();
            out.print("You are successfully registered");
} else {
    out.println("Please enter a valid password");
}
        } catch (Exception e) {
            out.println("You are not registered yet  " + e.getMessage());
        }
    }

}*/

import jakarta.servlet.RequestDispatcher;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Arpan
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con = null;
        PreparedStatement pstmt = null; // Change to PreparedStatement
        String uname = request.getParameter("username");
        String email = request.getParameter("email");
        String pwd = request.getParameter("password");
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "Nitesh123@#$");
            if (pwd != null && !pwd.trim().isEmpty()) {
                pstmt = con.prepareStatement("insert into newuser values(?, ?, ?)");
                pstmt.setString(1, uname);
                pstmt.setString(2, email);
                pstmt.setString(3, pwd);
                pstmt.executeUpdate();
                
                request.setAttribute("message", "Registration successful! Please login.");
                RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");          
                rd.forward(request, response); 
            
            } else {
                out.println("Please enter a valid password");
            }
        } catch (Exception e) {
            out.println("You are not registered yet  " + e.getMessage());
        }
    }
}
