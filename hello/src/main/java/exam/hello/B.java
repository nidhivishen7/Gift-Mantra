package exam.hello;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	
	private Icategory ct;		
	private Iorderdetails odt;			
	private Iorders od;		
	private Iproducts pd;
	private Iusers us;
	
	@Autowired
	public void setIct(Icategory ct) {
		this.ct = ct;
	}

	@Autowired
	public void setorderdetails(Iorderdetails odt) {
		System.out.println("Exam wired to service ");
		this.odt = odt;
	}

	
	@Autowired
	public void setIod(Iorders od) //  registering subject services
	{
		System.out.println("Subject Is registered");
		this.od = od;
	}
	
	
	@Autowired
	public void setpd(Iproducts pd) {
		this.pd = pd;
		System.out.println("Result service is registered");
	}
	@Autowired
	public void setus(Iusers us) {
		this.us = us;
	}

	public B()
	{
		
		System.out.println("basics are never out of fashion");
	}
	
	
	/*  /////////////////////  Working for category Tables ////////////////////////////////////////// */
	
	
	public category singlecat(int mn) 
	{	
		
		Optional<category> x= ct.findById(mn);
		category data=null;
		
		if(x.isPresent()) 
		{
			data= x.get();
		}
		else
		{
			System.out.println("data not found");
		}
		return data;
	}

	
	public List<category> CatAll() {
		// TODO Auto-generated method stub
		return ct.findAll();
	}

	
	/*----------------------------------  FOR PRODUCT TABLE ------------------------------*/
	
	public products singlepro(int mn) 
	{	
		
		Optional<products> x= pd.findById(mn);
		products data1=null;
		
		if(x.isPresent()) 
		{
			data1= x.get();
		}
		else
		{
			System.out.println("data not found");
		}
		return data1;
	}
	
	public String proUpd(products up) 
	{
		pd.save(up);
		return "Save Successful";
		
	}
	
	public List<products> ProAll() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}
	public String proDel(int mn) 
	{
		Optional<products> x= pd.findById(mn);
		String y="";
		if(x.isPresent()) 
		{
			pd.deleteById(mn);
			 y="Element Deleted successfuly";
		}
		else
		{
			y="Something went Wrong";
		}
		return y;
	}

	
	/*----------------------------------  FOR USERS TABLE ------------------------------*/
	
	public users singleuser(int mn) 
	{	
		
		Optional<users> x= us.findById(mn);
		users data1=null;
		
		if(x.isPresent()) 
		{
			data1= x.get();
		}
		else
		{
			System.out.println("data not found");
		}
		return data1;
	}
	
	public users userUpd(users up) 
	{
		us.save(up);
		return up;
		
	}
	
	public List<users> userAll() {
		
		return us.findAll();
	}
	
	public String userDel(int mn) 
	{
		Optional<users> x= us.findById(mn);
		String y="";
		if(x.isPresent()) 
		{
			us.deleteById(mn);
			 y="Element Deleted successfully";
		}
		else
		{
			y="Something went Wrong";
		}
		return y;
	}

	public users login(String email , String pass){
		System.out.println("2"+email+pass);
		Optional<users> x = us.findByLogin(email, pass);
		System.out.println("3"+x);
		System.out.println("method call");
		System.out.println(x);
		users y;
		if(x.isPresent())
		{
			 y = x.get();  
			
		}
		else
		{
			System.out.println("nottttt");
			y =new users(0,"0","-","-","-","-","-","-", "-", "-", "-", "-");	
		}
		
		return y;
	}
	
	
	/*-----------------------------------Orders---------------------------------*/
	
	
	public List<orders> byX(int i)
	{
		
		return od.findByX(i);
				
	}
	
/*------------------------------------------Orderdetails-------------------------------------*/
	
	public List<orderdetails> byY(int i)
	{
		
		return odt.findByX(i);
				
	}

	/*..................................forget password.....................................*/
	
	public HashMap getPassword(String email) {
		HashMap hp=new HashMap();
		
		String ret="Email Id is not registered";
		String pass=us.findPassword( email);
		
		System.out.println("check password"+pass+email);
		if(pass!=null) {
			
		ret= SendMail.call(email,pass);
		}
		hp.put("fpresult", ret);
		return hp;
}
	
}
