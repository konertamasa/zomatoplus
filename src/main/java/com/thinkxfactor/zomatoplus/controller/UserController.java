
package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.User;

@RestController
@RequestMapping("/user")
public class UserController {

	

/*	@GetMapping("/loginEn")
	public String userLogin(@RequestParam("username") String username,
			@RequestParam("password") String password)
	{
		User obj= new User();
		obj.setUsername("ASD");
		obj.setPassword("123");
		return "You are logged in";
	}*/

	@GetMapping("/all")
	public List<User> userList(){
		List<User> usr=new ArrayList<>();
		User u1,u2,u3;
		u1=new User("A","12");
		u2=new User("B","23");
		u3=new User("C","34");
		usr.add(u1);
		usr.add(u2);
		usr.add(u3);
		return usr;
	}
	
	@PostMapping("/create")
	public User usercreate(@RequestBody User us) {
		User u1=new User("A","1","abc@gmail.com","9876543201");
		System.out.println(u1.toString());
		return us;
		
	}
	
	@PostMapping("/login")
	public User userlogin(@RequestBody User usr)
	{
		User myus=new User("A","12","abc@gmail.com","9876503214");
	//	String name=myus.getUsername();
		String email=myus.getEmail();
		String pwd=myus.getPassword();
	//	String phn=myus.getPhone();
		
		if(email.equals("abc@gmail.com") && pwd.equals("12")) {
			System.out.println(myus.toString());
		}
		return usr;
	}
}
