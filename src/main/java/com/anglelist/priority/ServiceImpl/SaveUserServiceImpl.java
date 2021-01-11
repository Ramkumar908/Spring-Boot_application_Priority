package com.anglelist.priority.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anglelist.priority.Model.User;
import com.anglelist.priority.Repository.UserPriorityRepository;
import com.anglelist.priority.Service.UserPriorityService;


@Service
public class SaveUserServiceImpl implements UserPriorityService {

	@Autowired
    UserPriorityRepository userPriorityRepo;
	
	@Override
	public String SaveuserToDb(User user) {
		
		try
		{
			userPriorityRepo.save(user);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return "the User Save Sucessfully";
	}
	
	

}
