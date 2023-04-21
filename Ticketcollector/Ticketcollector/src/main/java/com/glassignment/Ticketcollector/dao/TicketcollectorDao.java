package com.glassignment.Ticketcollector.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.glassignment.Ticketcollector.entity.Appdetails;

@Repository
public interface TicketcollectorDao extends JpaRepository<Appdetails, Integer> {

	@Query(value = "select * from appdetails  where appdetails.tickettitle like %:keyword% or appdetails.ticket_short_description like %:keyword%", nativeQuery = true)
	List<Appdetails> findByKeyword(@Param("keyword") String keyword);

}
