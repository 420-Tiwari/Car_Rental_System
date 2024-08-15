import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
         protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection con = null;
        PreparedStatement pstmt = null;
        
        String name = request.getParameter("name");
        String carModel = request.getParameter("carModel");
    String bookingDate = request.getParameter("bookingdate");
        String returnDate = request.getParameter("returndate");

        try {
            // Load the JDBC driver and establish a connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Nitesh123@#$");

            // Prepare SQL statement for inserting data into the database
            String sql = "INSERT INTO car (cname, cmodel, booking_date, return_date) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, carModel);
            pstmt.setString(3, bookingDate);
            pstmt.setString(4, returnDate);

            // Execute the SQL statement
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                // If insertion was successful, forward to a success page or show a message
                request.setAttribute("message", "Booking successful! Thank you.");
                RequestDispatcher rd = request.getRequestDispatcher("/succcess.jsp");
                rd.forward(request, response);
            } else {
                // If insertion failed, display an error message
                out.println("Booking failed. Please try again.");
            }
        } catch (Exception e) {
            // Handle any errors
            out.println("An error occurred: " + e.getMessage());
        } 
    }
}
