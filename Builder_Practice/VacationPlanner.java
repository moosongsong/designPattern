package ºô´õ¿¬½À_652;

public class VacationPlanner {
	private int day;
	private String hotel;
	private String reservation;
	private String specialEvent;
	private String tickets;
	
	public VacationPlanner(int day, String hotel, String reservation, 
			String specialEvent, String tickets) {
		this.day = day;
		this.hotel = hotel;
		this.reservation = reservation;
		this.specialEvent = specialEvent;
		this.tickets = tickets;
	}

	public int getDay() {
		return day;
	}

	public String getHotel() {
		return hotel;
	}

	public String getReservation() {
		return reservation;
	}

	public String getSpecialEvent() {
		return specialEvent;
	}

	public String getTickets() {
		return tickets;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	public void setSpecialEvent(String specialEvent) {
		this.specialEvent = specialEvent;
	}

	public void setTickets(String tickets) {
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "VacationPlanner [day=" + day + ", hotel=" + hotel + ", reservation=" + reservation + ", specialEvent="
				+ specialEvent + ", tickets=" + tickets + "]";
	}
	
	
}
