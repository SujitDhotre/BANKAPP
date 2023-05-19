package Bank_bo;

public class Bankbo 
{

	private String Acc_no;
	private String User1_name;
	private String User1_id;
	private String User2_name;
	private String User2_id;
	private String Amount;
	private String pwd;
	public String getAcc_no() {
		return Acc_no;
	}
	public void setAcc_no(String acc_no) {
		Acc_no = acc_no;
	}
	public String getUser1_name() {
		return User1_name;
	}
	public void setUser1_name(String user1_name) {
		User1_name = user1_name;
	}
	public String getUser1_id() {
		return User1_id;
	}
	public void setUser1_id(String user1_id) {
		User1_id = user1_id;
	}
	public String getUser2_name() {
		return User2_name;
	}
	public void setUser2_name(String user2_name) {
		User2_name = user2_name;
	}
	public String getUser2_id() {
		return User2_id;
	}
	public void setUser2_id(String user2_id) {
		User2_id = user2_id;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Bankbo(String acc_no, String user1_name, String user1_id, String user2_name, String user2_id, String amount,
			String pwd) {
		super();
		Acc_no = acc_no;
		User1_name = user1_name;
		User1_id = user1_id;
		User2_name = user2_name;
		User2_id = user2_id;
		Amount = amount;
		this.pwd = pwd;
	}
	public Bankbo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bankbo [Acc_no=" + Acc_no + ", User1_name=" + User1_name + ", User1_id=" + User1_id + ", User2_name="
				+ User2_name + ", User2_id=" + User2_id + ", Amount=" + Amount + ", pwd=" + pwd + "]";
	}
	
	
	
}
