package Bank_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bank_Dao.Bank_dao;
import Bank_bo.Bankbo;
import Bank_bo.Operationbo;

/**
 * Servlet implementation class Deposite_Controller
 */
@WebServlet("/Deposite_Controller")
public class Deposite_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Bankbo Bankbo = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deposite_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		String D_amount=request.getParameter("D_amount");
		String Acc_no=request.getParameter("Acc_no");
		String User_id=request.getParameter("User_id");
		String pwd=request.getParameter("pwd");
		
		
		Operationbo ob=new Operationbo(D_amount, Acc_no, User_id, pwd);
		int status =Bank_dao.deposite(ob);
		if(status>0)
		{
			pw.print("Amount is deposite Sucessfully.....!");
		}
		else
		{
			pw.print("Some thing wrong....!");
		}
		
		
	}

}
