package com.anglelist.priority.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anglelist.priority.Model.User;

public interface UserPriorityRepository extends   JpaRepository<User,Integer>{

}
