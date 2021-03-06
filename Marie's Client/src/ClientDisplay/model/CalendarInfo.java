package ClientDisplay.model;
public class CalendarInfo implements java.io.Serializable {

		private  final long serialVersionUID = 1L;
		private String overallID = "CalendarInfo";
		private String calenderName;
		private String userName;
		private int publicOrPrivate;
		
		//Getters and setters
		public String getOverallID() {
			return overallID;
		}
		public void setOverallID(String overallID) {
			this.overallID = overallID;
		}
		public String getCalenderName() {
			return calenderName;
		}
		public void setCalenderName(String calenderName) {
			this.calenderName = calenderName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getPublicOrPrivate() {
			return publicOrPrivate;
		}
		public void setPublicOrPrivate(int publicPrivate) {
			this.publicOrPrivate = publicPrivate;
		}
}