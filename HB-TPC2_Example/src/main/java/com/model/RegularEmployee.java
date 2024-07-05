package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="regularemployee102")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})

public class RegularEmployee extends Employee1 {
	
	private float salary;
	private int bonous;
	
	
	public RegularEmployee(String name, float salary, int bonous) {
		super(name);
		this.salary = salary;
		this.bonous = bonous;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonous() {
		return bonous;
	}
	public void setBonous(int bonous) {
		this.bonous = bonous;
	}
	

}
