package com.training.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.book.ticket.app.dao.TicketBookingDao;
import com.training.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);
	}

}
