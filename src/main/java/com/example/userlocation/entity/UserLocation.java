package com.example.userlocation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class UserLocation {

    @Id
  
    private Long id;
    
    private String name;
    private double latitude;
    private double longitude;
    private boolean excluded;

    // Constructors, getters, setters

    public boolean isExcluded() {
        return excluded;
    }

    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }

	public void setId(Long userId) {
		// TODO Auto-generated method stub
		
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
