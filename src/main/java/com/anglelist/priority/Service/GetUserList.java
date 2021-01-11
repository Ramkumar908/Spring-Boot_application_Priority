package com.anglelist.priority.Service;

import java.util.List;

import com.anglelist.priority.Model.User;

public interface GetUserList {
	

	// For Fetching the list of all record From tha database with their all priority field and related satisfaction rate
	public List<User> getAlluserList() throws Exception;
}
