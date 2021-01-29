package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
    private long id;
    private String name;
    public User(){

    }
    public User(String name){
        super();
        this.name = name;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
