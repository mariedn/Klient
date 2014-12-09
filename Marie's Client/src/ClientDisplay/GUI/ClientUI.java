package ClientDisplay.GUI;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ClientDisplay.model.Calendar;
import ClientDisplay.model.Calendars;
import ClientDisplay.model.CreateCalendar;
import ClientDisplay.model.CreateEvent;
import ClientDisplay.model.Event;
import ClientDisplay.model.Events;
import ClientDisplay.model.Forecast;
import ClientDisplay.model.Forecasts;
import ClientDisplay.model.GetCalendars;
import ClientDisplay.model.GetEvents;
import ClientDisplay.service.ClientService;
import ClientDisplay.util.DateHelper;


public class ClientUI {

	private ClientUILogic clientUILogic;
	private String input;
	private String username;
	private String password;
	private boolean loggedIn;
	private boolean invalidUsername = true;
	private boolean invalidPassword = true;
	private static final String CBS_EMAIL = "@student.cbs.dk";
	private static final CharSequence EXIT = "exit";
	private static final CharSequence SPACE = " ";
	private ClientService clientService;
	private Scanner scanner;
	private boolean invalidInput = true;
	
	public ClientUI() {
		clientService = ClientService.getInstance();
	}
	
	public void run() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to your CBS Calendar \n");
		while(!loggedIn) {
			System.out.println("Username: \n");
			while(invalidUsername) {
				input = scanner.nextLine();
				if(inputIsExit(input)) {
					System.out.println("Goodbye!");
					return;
				}
				invalidUsername = isUsernameInvalid(input);
				if(invalidUsername) {
					System.out.println("Your username is your CBS e-mail. Please try again or enter \"Exit\" to close the client.\n");
				} else {
					username = input;
				}
			}
			
			System.out.println("Password: \n");
	
			while(invalidPassword) {
				input = scanner.nextLine();
				if(inputIsExit(input)) {
					System.out.println("Goodbye!");
					return;
				}
				invalidPassword = isPasswordInvalid(input);
				if(invalidPassword) {
					System.out.println("Please enter a valid password or enter \"Exit\" to close the client.\n");
				} else {
					password = input;
				}
			} 
			
			if(username!=null && password!=null) {
				loggedIn = clientService.login(username,password);
			}
			if(!loggedIn) {
				System.out.println("Incorrect, please try again or enter \"Exit\" to close the client.\n");
				invalidUsername = true;
				invalidPassword = true;
			}
		}
		
		System.out.println("You are now logged in");
		while (true) {
			
			System.out.println("Options:\n");
			System.out.println("1. Get calendar.\n");
			System.out.println("2. Create calendar.\n");
			System.out.println("3. Create event.\n");
			System.out.println("4. Get Quote Of The Day.\n");
			System.out.println("5. Get weather forecast.\n");
			System.out.println("0. Exit.\n");
	        String input = scanner.nextLine();
	        evaluateInput(input);	
	        
		}
//		scanner.close();
	}
	private void evaluateInput(String mainInput) {
		mainInput = mainInput.trim();
		int inputInt = Integer.parseInt(mainInput);
		switch (inputInt) {
		case 0:
			System.exit(0);
			break;
		case 1:
			getEventsFromCalendar(username);
			break;
		case 2:
			CreateCalendar createCalendar = getCreateCalendarInput();
			boolean calendarCreated = Boolean.valueOf(clientService.createCalendar(createCalendar));
			if(calendarCreated) {
				System.out.println("Calendar created:" +createCalendar.getCalendarName()+ "\n");
			} else {
				System.out.println("Could not create Calendar :" +createCalendar.getCalendarName()+ "\n");
				System.out.println("It might already exist or an error occured \n");
			}
			break;
		case 3:
			createEvent();
			break;
		case 4:
			getQOTD();
			break;
		case 5:
			getForecast();
			break;
		default:
			break;
		}
		
	}

	private void getForecast() {
		Forecasts forecasts = clientService.getForecast();
		for(Forecast forecast : forecasts.getForecasts()) {
			System.out.println(forecast);
		}
		
	}

	private void getQOTD() {
		clientService.getQuote();
		
	}

	private void getEventsFromCalendar(String username2) {
		Calendars calendars = clientService.getCalendars(username);
		GetEvents getEvents = new GetEvents();
		if(calendars==null) {
			System.out.println("Create a calendar that you can add events to.\n");
			return;
		}
		System.out.println("Enter the id of the calendar to get your events.\n");
		for(Calendar calendar : calendars.getCalendars()) {
			System.out.println(calendar.getId() + ". " + calendar.getName() + "\n");
		}
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateIsInt(input);

			if(invalidInput || !calendars.hasCalendarId(Integer.parseInt(input))) {
				System.out.println("Please enter calendar id\n");
			} else {
				if(calendars.hasCalendarId(Integer.parseInt(input))) {
					getEvents.setCalendarId(Integer.parseInt(input));
					invalidInput = false;
				}
			}
		} 
		Events events = clientService.getEvents(getEvents);
		if(events!=null) {
			System.out.println("The calendar" +getEvents.getCalendarId()+ " contains the following events: \n");
			for(Event event : events.getEvents()) {
				System.out.println(event+"\n");
			}
		}

		invalidInput = true;

	}

	private void createEvent() {
		Calendars calendars = clientService.getCalendars(username);
		CreateEvent createEvent = new CreateEvent();
		if(calendars==null) {
			System.out.println("Create a calendar that you can add events to.\n");
			return;
		}
		System.out.println("Enter the id of the calendar to create an event.\n");
		for(Calendar calendar : calendars.getCalendars()) {
			if(!calendar.getName().contains("_cbs_calendar")) {
				System.out.println(calendar.getId() + ". " + calendar.getName() + "\n");
			}
			
		}
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateIsInt(input);

			if(invalidInput || !calendars.hasCalendarId(Integer.parseInt(input))) {
				System.out.println("Please enter calendar id\n");
			} else {
				if(calendars.hasCalendarId(Integer.parseInt(input))) {
					createEvent.setCalendarId(Integer.parseInt(input));
					invalidInput = false;
				}
			}
		} 
		invalidInput = true;

		//set title
		System.out.println("Please enter title id\n");
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter title\n");
			} else {
				createEvent.setTitle(input); 
				invalidInput = false;
			}
		} 
		invalidInput = true;
		//set description
		System.out.println("Please enter description id\n");
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter description\n");
			} else {
				createEvent.setDescription(input); 
				invalidInput = false;
			}
		} 
		invalidInput = true;
		//set location
		System.out.println("Please enter location id\n");
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter location\n");
			} else {
				createEvent.setLocation(input); 
				invalidInput = false;
			}
		} 
		invalidInput = true;
		//set type
		System.out.println("Please enter event type id\n");
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter a valid type\n");
			} else {
				createEvent.setType(input); 
				invalidInput = false;
			}
		} 
		invalidInput = true;
		//set starttime
		System.out.println("Please start time in the format " +DateHelper.getFormat()+ "\n");
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter type\n");
			} else {
				createEvent.setStarttime(DateHelper.getFormattedDateObject(input));
				invalidInput = false;
			}
		} 
		invalidInput = true;
		//set endtime
		System.out.println("Please enter end time in the format " +DateHelper.getFormat()+ "\n");
		while(invalidInput) {
			input = scanner.nextLine();
			if(inputIsExit(input)) {
				System.exit(0);
			}
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter type\n");
			} else {
				createEvent.setEndtime(DateHelper.getFormattedDateObject(input));
				invalidInput = false;
			}
		} 
		invalidInput = true;
		createEvent.setUserName(username);
		String answer = clientService.createEvent(createEvent);
		System.out.println(answer);
		
	}

	private boolean evaluateIsInt(String intInput) {
		try {
			Integer.parseInt(intInput);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
		
	}

	private CreateCalendar getCreateCalendarInput() {
		CreateCalendar createCalendar = new CreateCalendar();
		createCalendar.setIsPrivate(1);
		createCalendar.setUserName(username);
		System.out.println("Enter Calendar name:\n");
		while(invalidInput) {
			input = scanner.nextLine();
			invalidInput = evaluateGeneralInput(input);
			if(invalidInput) {
				System.out.println("Please enter calendar name\n");
			} else {
				createCalendar.setCalendarName(input); 
				invalidInput = false;
			}
		} 
		return createCalendar;
	}
	
	private boolean inputIsExit(String inputString) {
		if(inputString!=null && !inputString.isEmpty() && inputString.toLowerCase().contains(EXIT)) {
			return true;
		}
		return false;
	}

	private boolean evaluateGeneralInput(String inputString) {
		if(inputString!=null && !inputString.isEmpty()) {
			return false;
		}
		return true;
	}
	
	private boolean isUsernameInvalid(String usernameInput) {
		if(usernameInput!=null && !usernameInput.isEmpty() && usernameInput.toLowerCase().contains(CBS_EMAIL)) {
			return false;
		}
		return true;
	}
	
	private boolean isPasswordInvalid(String passwordInput) {
		if(passwordInput!=null && !passwordInput.isEmpty() && !passwordInput.contains(SPACE)) {
			return false;
		}
		return true;
	}


}
