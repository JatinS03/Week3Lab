package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jatin
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
              .forward(request, response);  
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("initialAge");
        request.setAttribute("initialAge", age);
          
       
        
        if(age == null || age.equals(""))
        {
            request.setAttribute("message", "You must give your current age");
            
            request.setAttribute("input", age);
            
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request,response);

        }
        
        else{
            
            try{
            request.setAttribute("message", "Your next birthday will be " + (Integer.parseInt(age) + 1));
            }
            
            catch(NumberFormatException ex)
            {
             request.setAttribute("message", "You must enter a valid number");
            }
            }
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
        .forward(request, response); 
        
        
    }
}
