package com.LMS.DAOImpl;

import java.util.List;

import com.LMS.DAO.EventDao;
import com.LMS.model.Event;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class EventDaoImpl implements EventDao {

	private static final Logger logger = LoggerFactory.getLogger(EventDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addEvent(Event event) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(event);
		logger.info("Event saved successfully, Event Details=" + event);
	}

	@Override
	public void updateEvent(Event event) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(event);
		logger.info("Event updated successfully, Event Details=" + event);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Event> listEvents() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Event> eventsList = session.createQuery("from Event").list();
		for (Event event : eventsList) {
			logger.info("Event List::" + event);
		}
		return eventsList;
	}

	@Override
	public Event getEventById(int ID) {
		Session session = this.sessionFactory.getCurrentSession();
		Event event = (Event) session.load(Event.class, new Integer(ID));
		logger.info("Event loaded successfully, Event details=" + event);
		return event;
	}

	@Override
	public void removeEvent(int ID) {
		Session session = this.sessionFactory.getCurrentSession();
		Event event = (Event) session.load(Event.class, new Integer(ID));
		if (null != event) {
			session.delete(event);
		}
		logger.info("Event deleted successfully, Event details=" + event);
	}

}
