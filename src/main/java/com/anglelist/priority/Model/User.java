package com.anglelist.priority.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 8685203422523913733L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	 @Column(name="user_name",unique=true,nullable = false)
     private String user_name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name= "User_name",referencedColumnName="user_name")
	private List<PriorityList> user_priority;
	public User() {
		
	}
	public User(int user_id, String user_name, List<PriorityList> user_priority) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_priority = user_priority;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public List<PriorityList> getUser_priority() {
		return user_priority;
	}
	public void setUser_priority(List<PriorityList> user_priority) {
		this.user_priority = user_priority;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_priority=" + user_priority + "]";
	}
	
	
	
	
	
}
