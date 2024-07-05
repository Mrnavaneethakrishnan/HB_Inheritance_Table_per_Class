package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="trainee102")
@AttributeOverrides({
	@AttributeOverride(name="payperhour", column=@Column(name="payperhour")),
	@AttributeOverride(name="contractperiod",column=@Column(name="contractperiod"))
})
public class Trainee extends Employee1 {
	
	private float payperhour;
	private String contractperiod;
	
	public Trainee(String name, float payperhour, String contractperiod) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	
	

}
