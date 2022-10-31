package com.training.book.ticket.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.book.ticket.app.entities.Ticket;
import com.training.book.ticket.app.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	 
	@PostMapping(value="/create")
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
}
