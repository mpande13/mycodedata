package com.pcm2.main.bean;


import com.mks.api.response.WorkItem;


public class Issue { 

	private String id;
	private String state;
	private String type;
	private String model;
	private String project;
	private WorkItem wi;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public WorkItem getWi() {
		return wi;
	}
	public void setWi(WorkItem wi) {
		this.wi = wi;
	}
	
}
