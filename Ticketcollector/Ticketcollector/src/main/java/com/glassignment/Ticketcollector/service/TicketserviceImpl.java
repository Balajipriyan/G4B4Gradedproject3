package com.glassignment.Ticketcollector.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glassignment.Ticketcollector.dao.TicketcollectorDao;
import com.glassignment.Ticketcollector.entity.Appdetails;

@Service
public class TicketserviceImpl implements Ticketservice {
	TicketcollectorDao ticketcollectordao;

	public TicketserviceImpl(TicketcollectorDao ticketcollectordao) {
		super();
		this.ticketcollectordao = ticketcollectordao;

	}

	@Override
	public List<Appdetails> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketcollectordao.findAll();
	}

	@Override
	public Appdetails getTicketdeatils(int id) {
		// TODO Auto-generated method stub
		return ticketcollectordao.findById(id).get();
	}

	@Override
	public Appdetails updateTicket(Appdetails appdetails) {
		// TODO Auto-generated method stub
		return ticketcollectordao.save(appdetails);
	}

	@Override
	public Appdetails saveTicket(Appdetails appdetails) {
		// TODO Auto-generated method stub
		return ticketcollectordao.save(appdetails);
	}

	@Override
	public void deleteTicket(int id) {
		// TODO Auto-generated method stub
		ticketcollectordao.deleteById(id);
	}

	@Override
	public List<Appdetails> getByKeyword(String keyword) {
		return ticketcollectordao.findByKeyword(keyword);
	}

}
