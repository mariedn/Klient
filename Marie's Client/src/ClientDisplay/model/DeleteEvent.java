package ClientDisplay.model;

public class DeleteEvent implements java.io.Serializable{
	private static final long serialVersionUID = -3269894274812108796L;
	private String overallID = "deleteEvent"; 
	private String Name;
	
	//Getters and setters
	public String getOverallID() {
		return overallID;
	}
	public void setOverallID(String overallID) {
		this.overallID = overallID;
	}
	public String getName() {
		return Name;
	}
	public void setName (String Name) {
		this.Name = Name;
	}
}