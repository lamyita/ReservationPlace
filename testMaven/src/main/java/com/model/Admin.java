package com.model;

import java.io.Serializable;

public class Admin extends Users implements Serializable  {
	
	private String idUser;
	
	private Long nmbrReservation;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String email) {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public Long getNmbrReservation() {
		return nmbrReservation;
	}

	public void setNmbrReservation(Long nmbrReservation) {
		this.nmbrReservation = nmbrReservation;
	}
	
	
	

}
