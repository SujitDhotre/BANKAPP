package Bank_Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Bank_bo.Bankbo;
import Bank_bo.Operationbo;
import Bank_bo.Workingbo;


public class Bank_dao 
{

	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/BankApp";
			String uname="root";
			String pwd="Sujit@5";
			
			con= DriverManager.getConnection(url,uname,pwd);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
	}
	public static int signin(Bankbo bo)
	{
		int status=0;
		
		try
		{
			Connection con=Bank_dao.getConnection();
			
			String sql="insert into bank_app(Acc_no,User1_name,User1_id,User2_name,User2_id,Accbalance,pwd) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, bo.getAcc_no());
			ps.setString(2, bo.getUser1_name());
			ps.setString(3, bo.getUser1_id());
			ps.setString(4, bo.getUser2_name());
			ps.setString(5, bo.getUser2_id());
			ps.setString(6, bo.getAmount());
			ps.setString(7, bo.getPwd());
			
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		return status;
		
	}
	public static boolean login(String Acc_no,String pwd)
	{
		boolean status=false;
		try
		{
			Connection con=Bank_dao.getConnection();
			
			String sql="select * from bank_app where Acc_no=? and pwd=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, Acc_no);
			ps.setString(2, pwd);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}
	public static int deposite(Operationbo ob)
	{
		int status=0;
		try
		{
			Connection con=Bank_dao.getConnection();
			String s=ob.getAcc_no();
			String sql="select Accbalance from bank_app where Acc_no=";
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(sql+s);
			
			String av_bal="";
			while(rs.next())
			{
				av_bal=rs.getString(1);
			}
			
			int av_ba=Integer.parseInt(av_bal);
			int d_amount=Integer.parseInt(ob.getD_Amount());
			int update_balance=av_ba-d_amount;
			String up_balance=String.valueOf(update_balance);
			String sql1="update bank_app set Accbalance=? where pwd=?";
			PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setString(1, up_balance);
			ps1.setString(2, ob.getPwd());
			
			
			
			status=ps1.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	
	public static int creadit(Workingbo wb)
	{
		int status=0;
		try
		{
			Connection con=Bank_dao.getConnection();
			String s=wb.getAcc_no();
			String sql="select Accbalance from bank_app where Acc_no=";
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(sql+s);
			
			String av_bal="";
			while(rs.next())
			{
				av_bal=rs.getString(1);
			}
			
			int av_ba=Integer.parseInt(av_bal);
			int d_amount=Integer.parseInt(wb.getC_amount());
			int update_balance=av_ba+d_amount;
			String up_balance=String.valueOf(update_balance);
			String sql1="update bank_app set Accbalance=? where pwd=?";
			PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setString(1, up_balance);
			ps1.setString(2, wb.getPwd());
			
			
			
			status=ps1.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
