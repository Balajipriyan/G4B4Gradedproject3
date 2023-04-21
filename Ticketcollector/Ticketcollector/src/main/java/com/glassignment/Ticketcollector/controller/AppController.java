package com.glassignment.Ticketcollector.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glassignment.Ticketcollector.entity.Appdetails;
import com.glassignment.Ticketcollector.service.Ticketservice;

@Controller
@RequestMapping("appdetails")
public class AppController {
	Ticketservice ticservice;
	private boolean update = false;
	private int index;

	public AppController(Ticketservice ticservice) {
		super();
		this.ticservice = ticservice;
	}

	@GetMapping("/lists")
	public String showticketList(Model model) {

		model.addAttribute("tic", ticservice.getAllTickets());
		return "Ticket-list";
	}

	@GetMapping("/create-ticket")
	public String createticketList(Model model) {
		model.addAttribute("ticket", new Appdetails());
		return "Ticket";
	}

	@PostMapping("/saveticket")
	public String saveTic(Model model, @ModelAttribute("appdetails") Appdetails appdetail) {
		ticservice.saveTicket(appdetail);
		if (update)
			ticservice.deleteTicket(index);
		return "redirect:/appdetails/lists";
	}

	@GetMapping("/delete/{id}")
	public String deleteTic(Model model, @PathVariable int id) {
		ticservice.deleteTicket(id);
		return "redirect:/appdetails/lists";
	}

	@GetMapping("/update/{id}")
	public String updateEmp(@PathVariable int id, Model model) {
		Appdetails appdetails = ticservice.getTicketdeatils(id);
		ticservice.updateTicket(appdetails);
		model.addAttribute("ticket", appdetails);
		update = true;
		index = id;
		return "Ticketupdate";
	}

	@GetMapping(path = { "/search" })
	public String home(Appdetails appdetails, Model model, String keyword) {
		if (keyword != null) {
			List<Appdetails> list = ticservice.getByKeyword(keyword);
			model.addAttribute("tic", list);
		} else {
			List<Appdetails> list = ticservice.getAllTickets();
			model.addAttribute("tic", list);

		}
		return "Ticket-list";
	}

}
