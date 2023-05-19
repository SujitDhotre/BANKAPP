package Bank_bo;

public class Workingbo
{

	private String C_amount;
	private String Acc_no;
	private String User_id;
	private String pwd;
	public String getC_amount() {
		return C_amount;
	}
	public void setC_amount(String c_amount) {
		C_amount = c_amount;
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
	public Workingbo(String c_amount, String acc_no, String user_id, String pwd) {
		super();
		C_amount = c_amount;
		Acc_no = acc_no;
		User_id = user_id;
		this.pwd = pwd;
	}
	public Workingbo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Opration_bo [C_amount=" + C_amount + ", Acc_no=" + Acc_no + ", User_id=" + User_id + ", pwd=" + pwd
				+ "]";
	}
	
}
