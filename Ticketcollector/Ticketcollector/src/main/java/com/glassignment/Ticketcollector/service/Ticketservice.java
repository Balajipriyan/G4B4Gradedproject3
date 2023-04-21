package com.glassignment.Ticketcollector.service;

import java.util.List;

import com.glassignment.Ticketcollector.entity.Appdetails;

public interface Ticketservice {
	public List<Appdetails> getAllTickets();

	public Appdetails getTicketdeatils(int id);

	public Appdetails updateTicket(Appdetails appdetails);

	public Appdetails saveTicket(Appdetails appdetails);

	// public Appdetails SearchTicket(Appdetails appdetails);

	public void deleteTicket(int id);

	public List<Appdetails> getByKeyword(String keyword);

}
