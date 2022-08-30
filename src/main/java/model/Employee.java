package model;

import util.Util;

public class Employee {

	private long id;
	private String name;
	private String country;

	public Employee() {}

	public Employee(String name, String country) {
		long unique = Util.uniqueId();
		System.out.printf("Employee created with id %s", unique);
		this.id = unique;
		this.name = name;
		this.country = country;
	}

	//getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	//setters
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", country='" + country + '\'' +
				'}';
	}
}
