package com.example.University.Event.Management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private String eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;


    private String startTime;
    private String endTime;


 }
