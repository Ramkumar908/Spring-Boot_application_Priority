package com.anglelist.priority.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anglelist.priority.Model.User;
import com.anglelist.priority.Repository.UserPriorityRepository;
import com.anglelist.priority.Service.GetUserList;

@Service
public class GetUserListServiceImpl  implements GetUserList{

	
	@Autowired
    UserPriorityRepository userPriorityRepo;
	@Override
	public List<User> getAlluserList() throws Exception {
		
		
		return userPriorityRepo.findAll() ;
	}

}
