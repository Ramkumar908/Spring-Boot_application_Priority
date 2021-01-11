package com.anglelist.priority.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anglelist.priority.Model.User;
import com.anglelist.priority.Service.GetUserList;
import com.anglelist.priority.Service.UserPriorityService;

@RestController
public class UserPriorityController {
	
	
	
	@Autowired
	UserPriorityService saveuserService;
	
	@Autowired
	GetUserList getAllUserService;
	
	
	
    /*
     *  Save the user With their priority fields
     *  The resApi url for testing :http://localhost:8080/saverequest
     *  @RequestBody as a User Object In JSON Format
     */
	@PostMapping("/saverequest")
	public String SaveUserWithPriority(@RequestBody  User user  ) throws Exception
	{
    return saveuserService.SaveuserToDb(user);
		
	}
	
	/*
	 * Get  list of user with all the priority and all the satisfaction rate of each priority
	 * the rest end controll for api is :http://localhost:8080/GetUserList
	 */
	
	 @RequestMapping("/GetUserList")
	 public List<User> GetAllUserWithPriority() throws Exception
	{
	 
		
    	 return getAllUserService.getAlluserList();
	}
	

}
