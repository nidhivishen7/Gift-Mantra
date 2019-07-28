package exam.hello;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class A {
	
	private B obj1;
	@Autowired
	public void setCt(B ct) {
		this.obj1 = ct;
	}

	@Autowired
	public void setOdt(B odt) {
		this.obj1 = odt;
	}

	@Autowired
	public void setOd(B od) {
		this.obj1 = od;
	}

	@Autowired
	public void setPd(B pd) {
		this.obj1 = pd;
	}

	@Autowired
	public void setUs(B us) {
		this.obj1 = us;
	}


//http:localhost:8080?x=1
	
//http://localhost:8080/pw?x=1
	
//http://localhost:8080/pw?x=10
	
	
/* ---------------------FOR Products----------------------------------*/

	


	@GetMapping("/pw")
	public products f1(@RequestParam("x")int mn)//assume single select
	{
		System.out.println("function pw is getting called");
		products m =obj1.singlepro(mn);
		return m;
		
	}
	
	
	@PostMapping("/upd")
	public String f2(@RequestBody products n)
	{
		String m =obj1.proUpd(n);
		return m;
		
	}
	
	
	@GetMapping("/del")
	public String f4(@RequestParam("x")int mn)
	{
		System.out.println("function pw is getting called");
		String m =obj1.proDel(mn);
		return m;
		
	}
	
		
	@GetMapping("/ms") //multiselect
	public List<products> get()
	{
		List<products> x =obj1.ProAll();
		return x;
		
	}
	
	
/*-------------------------------------------FOR Category--------------------------------------------------*/
	
	@GetMapping("/ssig")
	public category Subdata(@RequestParam("x")int mn ) 
	{
		System.out.println("Subject single select call ");
		category m= obj1.singlecat(mn);
		
		return m;
	}
	
	@GetMapping("/msc") //multiselect
	public List<category> get1()
	{
		List<category> x =obj1.CatAll();
		return x;
		
	}
	
	// ---------------Users------------
	
	@GetMapping("/pw12")
	public users f2(@RequestParam("x")int mn)//assume single select
	{
		
		System.out.println("function pw is getting called");
		users m =obj1.singleuser(mn);
		return m;
		
	}
	
	@GetMapping("/log") //Login
	public users login(@RequestParam("x") String email,@RequestParam("y") String pass)
	{	System.out.println("1");
		users x =obj1.login(email, pass);
		
		return x;
		
	}
	
	
	@PostMapping("/upd12")
	public users f21(@RequestBody users n)
	{
		users m =obj1.userUpd(n);
		return m;
		
	}
	
	
	@GetMapping("/del12")
	public String f41(@RequestParam("x")int mn)
	{
		System.out.println("function pw is getting called");
		String m =obj1.userDel(mn);
		return m;
		
	}
	
		
	@GetMapping("/ms12") //multiselect
	public List<users> get2()
	{
		List<users> x =obj1.userAll();
		return x;
		
	}
	
	/*-----------------------------FOR orders---------------------------------*/
	
	@GetMapping("/Exsig")
	public List<orders> oddata(@RequestParam("x")int mn ) 
	{
		System.out.println("Subject single select call ");
		List<orders> m= obj1.byX(mn);
		return m;
	}

	
	
	/*-------------------------------------orderdetails------------------------------------------------*/
	
	
	@GetMapping("/erxs")
	public List<orderdetails> oddata2(@RequestParam("x")int mn ) 
	{
		System.out.println("Subject single select call ");
		List<orderdetails> m= obj1.byY(mn);
		return m;
	}




/*........................Fetch Password...............................*/
@GetMapping("/getPassword") //Login
public HashMap login(@RequestParam("x") String email)
{
	HashMap x =obj1.getPassword(email);
	return x;
	
}


/* ---------------------Get Profile----------------------------------*/


@GetMapping("/getProfile")
public users f1(@RequestParam("x")String user)//assume single select
{	
	int j=Integer.parseInt(user.substring(5));
	System.out.println("function getProfile is getting called"+j);
	users m =obj1.singleuser(j);
	return m;
	
}

/*......................update profile..................................*/

@PostMapping("/updProfile")
public users f2(@RequestBody users n)//Update the Details Of student
{
	users m =obj1.userUpd(n);
	return m;
	
}






}
