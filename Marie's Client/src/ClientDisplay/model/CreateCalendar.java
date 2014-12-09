package ClientDisplay.model;

public class CreateCalendar implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3269894274812108796L;
	private String overallID = "createCalendar";
	private String calendarName;
	private String userName;
	private long userID;
	private int isPrivate;
	
	//Getters and setters
	public String getOverallID() {
		return overallID;
	}
	public void setOverallID(String overallID) {
		this.overallID = overallID;
	}
	public String getCalendarName() {
		return calendarName;
	}
	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}
	public long getUserID (){
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getIsPrivate() {
		return isPrivate;
	}
	public void setIsPrivate(int isPrivate) {
		this.isPrivate = isPrivate;
	}


}