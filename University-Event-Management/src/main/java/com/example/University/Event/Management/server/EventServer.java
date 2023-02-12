package com.example.University.Event.Management.server;

import com.example.University.Event.Management.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
public class EventServer implements IEvent {
    private static List<Event> eventList = new ArrayList<>();
    static{
        Event e1 = new Event("EV1","EGames","CSEBlock","2022/12/04","11:30 AM","4:30 PM");
            eventList.add(e1);
    }
    @Override
    public String addEvent(Event event){
        eventList.add(event);
        return "Event Added Successfully";
    }
    @Override
    public List<Event> getAllEventByDate(String date){
       List<Event> listofEventOnThatDate = new ArrayList<>();
        for(Event event : eventList){
           if(event.getDate().equals(date)){
               listofEventOnThatDate.add(event);
           }
       }
        if(listofEventOnThatDate.size()==0){
            return null;
        }
        return listofEventOnThatDate;
    }
    @Override
    public String DeleteEvent(String EventId){
        for(Event event:eventList){
            if(event.getEventId().equals(EventId)){
                eventList.remove(event);
                return "Event Removed Successfully";
            }
        }
        return "Event was not found and unable to perform delete operation";
    }
    @Override
    public Event getEventById(String EventId){
        for(Event event:eventList){
            if(event.getEventId().equals(EventId)){
                return event;
            }
        }
        return null;
    }
    @Override
    public String UpdateEvent(String EventId,Event newevent){
        Event event = getEventById(EventId);
        if(event!=null){
            event.setEventName(newevent.getEventName());
            event.setLocationOfEvent(newevent.getLocationOfEvent());
            event.setDate(newevent.getDate());
            event.setStartTime(newevent.getStartTime());
            event.setEndTime(newevent.getEndTime());
            return "Event updated successfully";
        }
        return "Event with eventId"+EventId+" Not found";
    }
    public List<Event> getAllEvents(){
        return eventList;
    }
}
