package ClientDisplay.model;

import java.util.ArrayList;


/**
 * Created by jesperbruun on 10/10/14.
 * Den laver selve arrayet af alle generede Events
 */
public class Events {
    ArrayList<Event> events = new ArrayList<Event>();

    public ArrayList<Event> getEvents() {
    	return events;
    }

    public void setEvents(ArrayList<Event> event) {
        this.events = event;
    }
    
}