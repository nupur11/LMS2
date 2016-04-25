package com.LMS.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LMS.DAO.EventDao;
import com.LMS.Service.EventService;
import com.LMS.model.Event;

@Service
public class EventServiceImpl implements EventService {
	
	private EventDao eventDao;

	public void setPersonDAO(EventDao eventDao) {
		this.eventDao = eventDao;
		
	}
	
	@Override
	@Transactional
	public void addEvent(Event event) {
		this.eventDao.addEvent(event);
	}

	@Override
	@Transactional
	public void updateEvent(Event event) {
		this.eventDao.updateEvent(event);
	}

	@Override
	@Transactional
	public List<Event> listEvents() {
		return this.eventDao.listEvents();
	}

	@Override
	@Transactional
	public Event getEventById(int ID) {
		return this.eventDao.getEventById(ID);
	}

	@Override
	@Transactional
	public void removeEvent(int ID) {
		this.eventDao.removeEvent(ID);
	}
	
	

}
