package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.models.AddItem;








@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private ItemRepository ItemsRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant rst) {
		Restaurant persistedrestaurant=restaurantRepository.save(rst);
		return persistedrestaurant;
	}
	@PostMapping("/additems")
	public AddItem addItems(@RequestBody AddItem its) {
		AddItem persisteditems=ItemsRepository.save(its);
		return persisteditems;
	}
	

	@GetMapping("/getAll")
	public List<Restaurant> getAll(){
		List<Restaurant>listofrestaurants=restaurantRepository.findAll();
		return listofrestaurants;}
		
		@GetMapping("/getItems")
		public List<AddItem> getAllItems(){
			List<AddItem>listofitems=ItemsRepository.findAll();
			return listofitems;}

/*	@PostMapping("/create")
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
		
	}*/

}