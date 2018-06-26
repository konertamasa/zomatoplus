package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.AddItem;



@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@PostMapping("/create")
	public Restaurant restcreate(@RequestBody Restaurant r1) {
		Restaurant rr=new Restaurant("ABC","22 BK Street","abc@gmail.com","9876543201");
		System.out.println(rr.toString());
		return r1;
		
	}

	@GetMapping("/getall")
	public List<Restaurant> restList(){
		List<Restaurant> usr=new ArrayList<>();
		Restaurant r1,r2,r3;
		r1=new Restaurant("ABC","22 BK Street","abc@gmail.com","9876543201");
		r2=new Restaurant("CDE","32 BK Street","cde@gmail.com","9876534201");
		r3=new Restaurant("EFG","68 BK Street","efg@gmail.com","9876556201");
		usr.add(r1);
		usr.add(r2);
		usr.add(r3);
		return usr;
	}
	
	@PostMapping("/AddItem")
	public AddItem aditemcreate(@RequestBody AddItem at) {
		AddItem ai1=new AddItem("Item1","Item2","Item3","Item4");
		System.out.println(ai1.toString());
		AddItem ai2=new AddItem("Item5","Item6","Item7","Item8");
		System.out.println(ai2.toString());
		return at;
		
	}

}