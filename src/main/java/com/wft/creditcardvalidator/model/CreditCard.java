package com.wft.creditcardvalidator.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class CreditCard implements Serializable {
	
	private static final long serialVersionUID = 6541162783907686900L;
	@Id
	@Column
	private String pannumber;

	@Column
	private double creditscore;



	public CreditCard() {
		super();
	}

	public CreditCard(double creditscore) {
		super();
		this.creditscore = creditscore;
	}


	public double getCreditscore() {
		return creditscore;
	}

	public void setCreditscore(double creditscore) {
		this.creditscore = creditscore;
	}

	public String getPanNumber() {
		return pannumber;
	}

	public void setPanNumber(String pannumber) {
		this.pannumber = pannumber;
	}


	
}
