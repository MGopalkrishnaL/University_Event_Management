package com.example.University.Event.Management.server;

import com.example.University.Event.Management.model.Event;


import java.util.List;

public interface IEvent {
    public String addEvent(Event event);
    public List<Event> getAllEventByDate(String date);
    public String DeleteEvent(String EventId);
    public Event getEventById(String EventId);
    public String UpdateEvent(String EventId,Event newevent);
    public List<Event> getAllEvents();

}
