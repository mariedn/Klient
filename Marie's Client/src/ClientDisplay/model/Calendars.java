package ClientDisplay.model;

import java.util.ArrayList;

public class Calendars {
	ArrayList<Calendar> calendars;

	public ArrayList<Calendar> getCalendars() {
		return calendars;
	}

	public void setCalendars(ArrayList<Calendar> calendars) {
		this.calendars = calendars;
	}
	
	public boolean hasCalendarId(int id) {
		for(Calendar calendar : calendars) {
			if(calendar.getId()==id) {
				return true;
			}
		}
		return false;
	}
}
