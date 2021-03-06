package com.model;

import java.util.Date;

public class Reservation {
	
	private Long id;
	private Long idUser;
	private Date date;
	private boolean confirmation;
	
	public Reservation() {
		super();
	}

	public Reservation(Long idUser, Date date, boolean confirmation) {
		super();
		this.idUser = idUser;
		this.date = date;
		this.confirmation = confirmation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}
	
	
}
