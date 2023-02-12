package com.example.University.Event.Management.controller;

import com.example.University.Event.Management.model.Event;
import com.example.University.Event.Management.server.IEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Events")
public class Controller {
    @Autowired
    private IEvent iEvent;
    @PostMapping("/add-event")
//    http://localhost:8080/Events/add-event
    public String AddEvent(@RequestBody Event event){
        return iEvent.addEvent(event);
    }
    @PutMapping("/update-event/")
//    http://localhost:8080/Events/update-event/
    public String updateEvent(@RequestParam String EventId , @RequestBody Event event){
        return iEvent.UpdateEvent(EventId,event);
    }
    @DeleteMapping("/delete-event/")
//    http://localhost:8080/Events/delete-event/{EventId}
    public String deleteEvent(@RequestParam String EventId){
        return iEvent.DeleteEvent(EventId);
    }
    @GetMapping("/get-allEventsByDate/")
//    http://localhost:8080/Events/get-allEventsByDate/{Date}
    public List<Event> getAllEvent(@RequestParam String Date){
        return iEvent.getAllEventByDate(Date);
    }
    @GetMapping("/get-allEvents")
//    http://localhost:8080/Events/get-allEvents
    public List<Event> getAllEvents(){
        return iEvent.getAllEvents();
    }
}
