package exam.hello;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {
	@Id
	private int userid;
	private String user_Email, user_Pass, user_First_Name, users_Last_Name, user_City, user_State, user_Zip, user_Phone, user_Country, user_Address1, user_Address2;
	public users() {
		
	}
	public users(int userid, String user_Email, String userPass, String user_First_Name, String users_Last_Name,
			String user_City, String user_State, String user_Zip, String user_Phone, String user_Country,
			String user_Address1, String user_Address2) {
		super();
		this.userid = userid;
		this.user_Email = user_Email;
		this.user_Pass = userPass;
		this.user_First_Name = user_First_Name;
		this.users_Last_Name = users_Last_Name;
		this.user_City = user_City;
		this.user_State = user_State;
		this.user_Zip = user_Zip;
		this.user_Phone = user_Phone;
		this.user_Country = user_Country;
		this.user_Address1 = user_Address1;
		this.user_Address2 = user_Address2;
	}
	@Override
	public String toString() {
		return "users [userid=" + userid + ", user_Email=" + user_Email + ", userPass=" + user_Pass
				+ ", user_First_Name=" + user_First_Name + ", users_Last_Name=" + users_Last_Name + ", user_City="
				+ user_City + ", user_State=" + user_State + ", user_Zip=" + user_Zip + ", user_Phone=" + user_Phone
				+ ", user_Country=" + user_Country + ", user_Address1=" + user_Address1 + ", user_Address2="
				+ user_Address2 + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUserPass() {
		return user_Pass;
	}
	public void setUserPass(String userPass) {
		this.user_Pass = userPass;
	}
	public String getUser_First_Name() {
		return user_First_Name;
	}
	public void setUser_First_Name(String user_First_Name) {
		this.user_First_Name = user_First_Name;
	}
	public String getUsers_Last_Name() {
		return users_Last_Name;
	}
	public void setUsers_Last_Name(String users_Last_Name) {
		this.users_Last_Name = users_Last_Name;
	}
	public String getUser_City() {
		return user_City;
	}
	public void setUser_City(String user_City) {
		this.user_City = user_City;
	}
	public String getUser_State() {
		return user_State;
	}
	public void setUser_State(String user_State) {
		this.user_State = user_State;
	}
	public String getUser_Zip() {
		return user_Zip;
	}
	public void setUser_Zip(String user_Zip) {
		this.user_Zip = user_Zip;
	}
	public String getUser_Phone() {
		return user_Phone;
	}
	public void setUser_Phone(String user_Phone) {
		this.user_Phone = user_Phone;
	}
	public String getUser_Country() {
		return user_Country;
	}
	public void setUser_Country(String user_Country) {
		this.user_Country = user_Country;
	}
	public String getUser_Address1() {
		return user_Address1;
	}
	public void setUser_Address1(String user_Address1) {
		this.user_Address1 = user_Address1;
	}
	public String getUser_Address2() {
		return user_Address2;
	}
	public void setUser_Address2(String user_Address2) {
		this.user_Address2 = user_Address2;
	}
	
	
}
