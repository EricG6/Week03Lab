package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/servlets"})
public class AgeCalculatorServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        request.setAttribute("age", age);
        
        
        if (age == null || age.equals("")){
            request.setAttribute("message", "Please Enter a valid Input");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        try {
            int currentAge = Integer.parseInt(age) + 1;
            request.setAttribute("message", "Your age next birthday will be " + currentAge + ".");
        } catch (NumberFormatException e) {
            request.setAttribute("message", "You must enter a valid number.");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    

}
