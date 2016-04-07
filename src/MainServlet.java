

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double payment=0; 
        String modifiedPayment="";
		
		
		String user_input1=request.getParameter("principal");
		System.out.println("Just checking: "+user_input1);
		
		 double principal = Double.parseDouble((user_input1));
		 System.out.println("The amount entered is: "+principal);
		 
		String user_input2=request.getParameter("rate");
		 double rate = Double.parseDouble((user_input2));
		 
		 String user_input3=request.getParameter("term");
		 double term = Double.parseDouble((user_input3));
		
		 
		 Calculate calc=new Calculate();
		 
		 payment=calc.CalcMortgage(principal, rate, term);
		 
		 System.out.println(payment);
		 
		 Modify answer=new Modify();
		 
		 modifiedPayment=answer.CalcModified(payment);
		 
		 System.out.println(modifiedPayment);
		 
		 request.setAttribute("modifiedPayment", modifiedPayment);
		 request.setAttribute("principal", principal);
		 request.setAttribute("rate", rate);
		 request.setAttribute("term", term);
		 
	     request.getRequestDispatcher("/output.jsp").forward(request, response);

	}

}
