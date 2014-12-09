package ClientDisplay.service;

import ClientDisplay.model.AuthUser;
import ClientDisplay.model.Calendars;
import ClientDisplay.model.CreateCalendar;
import ClientDisplay.model.CreateEvent;
import ClientDisplay.model.Events;
import ClientDisplay.model.Forecasts;
import ClientDisplay.model.GetCalendars;
import ClientDisplay.model.GetEvents;
import ClientDisplay.model.GetWeatherForecast;

import com.google.gson.Gson;

public class ClientService {
	//Client is never admin or doesn't care
	private static final boolean IS_ADMIN = false;
	private static final Object LOGGED_IN = "0";
	private static ClientService instance;
	ServerComService serverComService;
	Gson gson;
	
	private ClientService(){
		serverComService = new ServerComService();
		gson = new Gson();
	}
	
	public static ClientService getInstance() {
		if(instance==null) {
			instance = new ClientService();
		}
		return instance;
	}
	
	public boolean login(String email, String password) {
		AuthUser authUser = new AuthUser();
		authUser.setAuthUserEmail(email.trim());
		authUser.setAuthUserPassword(password.trim());
		authUser.setAuthUserIsAdmin(IS_ADMIN);
		String loginReply = serverComService.communicate(gson.toJson(authUser));
		if(loginReply!=null && loginReply.equals(LOGGED_IN)) {
			return true;
		}
		else {
			return false;
		}
	
	
	}
	


	public void getQuote(){
		String json = "{\"id\":\"getQuote\"}";
		String getQuoteReply = serverComService.communicate(json);
		System.out.println("Quote of the day:\n" + getQuoteReply);
	}
	
	public Calendars getCalendars(String username) {
		GetCalendars getCalendars = new GetCalendars();
		getCalendars.setUserName(username);
		String getCalendarsReply = serverComService.communicate(gson.toJson(getCalendars));
		Calendars calendars = gson.fromJson(getCalendarsReply, Calendars.class);
		if(calendars!=null && calendars.getCalendars()!=null && calendars.getCalendars().size()>0) {
			return calendars;
		} else {
			return null;
		}
	}
	public Events getEvents(GetEvents getEvents) {
		String getEventsReply = serverComService.communicate(gson.toJson(getEvents));
		Events events = (Events)gson.fromJson(getEventsReply, Events.class);
		return events;
	}
	public String createCalendar(CreateCalendar createCalendar) {
		String createCalendarsReply = serverComService.communicate(gson.toJson(createCalendar));
		return createCalendarsReply;
	}
	
	public String createEvent(CreateEvent createEvent) {
		String createEventReply = serverComService.communicate(gson.toJson(createEvent));
		return createEventReply;
	}

	public Forecasts getForecast() {
		String getForecastReply = serverComService.communicate(gson.toJson(new GetWeatherForecast()));
		Forecasts forecasts = gson.fromJson(getForecastReply, Forecasts.class);
		return forecasts;
		
	}
	
}
