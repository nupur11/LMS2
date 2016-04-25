package com.LMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.LMS.Service.EventService;
import com.LMS.model.Event;

@Controller
public class EventController {
	
private EventService eventService;
	
	@Autowired(required=true)
	@Qualifier(value="eventService")
	public void setPersonService(EventService es){
		this.eventService = es;
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String listEvents(Model model) {
		model.addAttribute("events", new Event());
		model.addAttribute("listEvents", this.eventService.listEvents());
		return "events";
	}
	
	//For add and update event both
	@ModelAttribute("event")
		@RequestMapping(value= "/event/add", method = RequestMethod.POST)
		public String addEvent(Model model , @ModelAttribute("event") Event event){
			
			if(event.getID() == 0){
				//new event, add it
				model.addAttribute("event", new Event());
				this.eventService.addEvent(event);
				
			}else{
				//existing event, call update
				model.addAttribute("event", new Event());
				this.eventService.updateEvent(event);
			
				
			}
			
			return "redirect:/event";
			
		}
	
		
		@RequestMapping("/remove/{id}")
	    public String removeEvent(@PathVariable("id") int ID){
			
	        this.eventService.removeEvent(ID);
	        return "redirect:/events";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public String editEvent(@PathVariable("id") int ID, Model model){
	        model.addAttribute("event", this.eventService.getEventById(ID));
	        model.addAttribute("listEvents", this.eventService.listEvents());
	        return "event";
	    }

}
