package com.LMS.DAO;

import java.util.List;

import com.LMS.model.Event;

public interface EventDao {

	public void addEvent(Event event);
	public void updateEvent(Event p);
	public List<Event> listEvents();
	public Event getEventById(int id);
	public void removeEvent(int id);
	
}
