package Bank_bo;

public class Operationbo 
{
	private String D_Amount;
	private String Acc_no;
	private String User_id;
	private String pwd;
	public String getD_Amount() {
		return D_Amount;
	}
	public void setD_Amount(String d_Amount) {
		D_Amount = d_Amount;
	}
	public String getAcc_no() {
		return Acc_no;
	}
	public void setAcc_no(String acc_no) {
		Acc_no = acc_no;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Operationbo(String d_Amount, String acc_no, String user_id, String pwd) {
		super();
		D_Amount = d_Amount;
		Acc_no = acc_no;
		User_id = user_id;
		this.pwd = pwd;
	}
	public Operationbo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Operationbo [D_Amount=" + D_Amount + ", Acc_no=" + Acc_no + ", User_id=" + User_id + ", pwd=" + pwd
				+ "]";
	}
	
}
