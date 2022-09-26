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
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setAttribute("answer", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
              .forward(request, response); 
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
       String sign = request.getParameter("sign");
       
       String first = request.getParameter("first");
       
       String second = request.getParameter("second");
       
        if(first == null || first.isEmpty() || second == null || second.isEmpty()){
                request.setAttribute("answer", "invalid");
        }
       
        else{
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            try{
                int int1 = Integer.parseInt(first);
                int int2 = Integer.parseInt(second);
                
              switch(sign){
                case "*":
                request.setAttribute("answer", int1 * int2);
                break;
                case "%":
                request.setAttribute("answer", int1 % int2);
                break;
                 case "+":
                request.setAttribute("answer", int1 + int2);
                break;  
                case "-":
                request.setAttribute("answer", int1 - int2);
                break;
                
            }
            }
            catch(NumberFormatException e){
                request.setAttribute("answer", "invalid");
                             getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
                                     .forward(request, response);
            }
            
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp")
              .forward(request, response); 
    }

  
}
