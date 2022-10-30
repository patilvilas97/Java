package com.training.book.ticket.app.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	
	@Column(name="passenger_name", nullable=false)
	private String passengerName;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="dest_station")
	private String destStation;
	
	@Column(name="email")
	private String email;
	
	
}
