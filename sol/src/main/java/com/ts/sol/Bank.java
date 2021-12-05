package com.ts.sol;

import java.io.Serializable;

public class Bank implements Serializable {

	private static final long serialVersionUID = 1986780493060656185L;
	
	private Integer id;
	private String name;
	private String type;
	private String city;
	private String state;
	private String zip;
	
	public Bank(Integer id, String name, String type, String city, String state, String zip) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	
	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Type=" + type + ", City=" + city + ", State=" + state + ", Zip="
				+ zip;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

}
