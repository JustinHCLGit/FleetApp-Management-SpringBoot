package com.kindsonthegenius.fleetapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@MappedSuperclass //Means this not an entity but is a super class. Cannot create a table CommonbOject as it's an abstract class u can't instantiate it and u only use it to inherit other classes
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CommonObject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String details;
	//Generated constructor using field Source
	public CommonObject(int id, String description, String details) {		
		this.id = id;
		this.description = description;
		this.details = details;
	}
	//Generated empty constructor using field
	public CommonObject() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override //The @Override annotation indicates that the child class method is over-writing its base class method
	public String toString() //The toString method is used to return a string representation of an object. If any object is printed, the toString() method is internally invoked by the java compiler
	{
		return "CommonObject [id=" + id + ", description=" + description + ", details=" + details + "]";
	}
	
	

}
