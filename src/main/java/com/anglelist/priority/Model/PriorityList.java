package com.anglelist.priority.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PriorityList {
	@Id
	private int id;
	private String priority_name;
	private String satisfaction_rate;
	public PriorityList() {
		super();
		
	}
	public PriorityList(int id, String priority_name, String satisfaction_rate) {
		this.id = id;
		this.priority_name = priority_name;
		this.satisfaction_rate = satisfaction_rate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPriority_name() {
		return priority_name;
	}
	public void setPriority_name(String priority_name) {
		this.priority_name = priority_name;
	}
	public String getSatisfaction_rate() {
		return satisfaction_rate;
	}
	public void setSatisfaction_rate(String satisfaction_rate) {
		this.satisfaction_rate = satisfaction_rate;
	}
	@Override
	public String toString() {
		return "PriorityList [id=" + id + ", priority_name=" + priority_name + ", satisfaction_rate="
				+ satisfaction_rate + "]";
	}
	
	

}
