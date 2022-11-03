package com.training.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.book.ticket.app.entities.Ticket;
import com.training.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner{

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("Vilas Patil");
		ticket.setEmail("Patilvilas97@gmail.com");
		
		Ticket ticket1 = new Ticket();
		ticket1.setBookingDate(new Date());
		ticket1.setDestStation("Mumbai");
		ticket1.setSourceStation("Nashik");
		ticket1.setPassengerName("Rujula Mane");
		ticket1.setEmail("ManeRujula@gmail.com");
		
		ticketBookingService.createTicket(ticket);
		ticketBookingService.createTicket(ticket1);
		
		System.out.println("Data Source :: "+dataSource);
	}

}
