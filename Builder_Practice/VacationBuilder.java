package ºô´õ¿¬½À_652;

public class VacationBuilder extends Abstract_Builder{
	VacationPlanner vacation = null;
	private static VacationBuilder builder = null;
		
	public static VacationBuilder getBuilder() {
		if(builder==null) {
			builder= new VacationBuilder();
		}
		builder.vacation = new VacationPlanner
				(1,	"grade", "restuarant", "magicShow", "cable Car");
		return builder;
	}
	
	@Override
	public void buildDay(int date) {
		this.vacation.setDay(date);
	}

	@Override
	public void addHotel(int date, String hotel) {
		this.vacation.setDay(date);
		this.vacation.setHotel(hotel);
	}

	@Override
	public void addReservation(String reservation) {
		this.vacation.setReservation(reservation);
	}

	@Override
	public void SpecialEvent(String specialEvent) {
		this.vacation.setSpecialEvent(specialEvent);
	}

	@Override
	public void addTickets(String tickets) {
		this.vacation.setTickets(tickets);
	}

	@Override
	public VacationPlanner getVacationPlanner() {
		return new VacationPlanner(vacation.getDay(), vacation.getHotel(), vacation.getReservation(),
				vacation.getSpecialEvent(),vacation.getTickets());
	}

}
