package Utils;

public class DataStore {
	private static String ticketId;
	
	public static void setTicketId(String tid) {
		ticketId = tid;
	}
	
	public static String getTicketId () {
		return ticketId;
	}
}
