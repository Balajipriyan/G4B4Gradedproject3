package com.glassignment.Ticketcollector.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appdetails")
public class Appdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "tickettitle")
	private String Tickettitle;
	@Column(name = "ticketShortDescription")
	private String TicketShortDescription;
	@Column(name = "Ticketcreatedate")
	private String Ticketcreatedate;

	public Appdetails(String tickettitle, String ticketShortDescription, String ticketcreatedate, int id) {
		super();
		this.id = id;
		this.Tickettitle = tickettitle;
		this.TicketShortDescription = ticketShortDescription;
		this.Ticketcreatedate = ticketcreatedate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTickettitle() {
		return Tickettitle;
	}

	public void setTickettitle(String tickettitle) {
		this.Tickettitle = tickettitle;
	}

	public String getTicketShortDescription() {
		return TicketShortDescription;
	}

	public void setTicketShortDescription(String ticketShortDescription) {
		this.TicketShortDescription = ticketShortDescription;
	}

	public String getTicketcreatedate() {
		return Ticketcreatedate;
	}

	public void setTicketcreatedate(String ticketcreatedate) {
		this.Ticketcreatedate = ticketcreatedate;
	}

	public Appdetails() {
		super();
	}

}
