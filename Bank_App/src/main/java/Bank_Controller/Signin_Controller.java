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

/**
 * Servlet implementation class Signin_Controller
 */
@WebServlet("/Signin_Controller")
public class Signin_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signin_Controller() {
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
		
		String Acc_no=request.getParameter("Acc_no");
		String User1_name=request.getParameter("User1_name");
		String User1_id=request.getParameter("User1_id");
		
		String User2_name=request.getParameter("User2_name");
		String User2_id=request.getParameter("User2_id");
		
		String Amount=request.getParameter("Amount");
		
		String pwd=request.getParameter("pwd");
		
		Bankbo bo=new Bankbo(Acc_no,User1_name,User1_id,User2_name,User2_id,Amount,pwd);
		
		int status=Bank_dao.signin(bo);
		
		if(status>0)
		{
			pw.print("Account Created.....!!!");
		}
		else
		{
			pw.print("SomeThing went wrong...!!");
		}
		
		
	}

}
