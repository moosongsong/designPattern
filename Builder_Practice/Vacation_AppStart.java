package ºô´õ¿¬½À_652;

public class Vacation_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VacationBuilder builder = VacationBuilder.getBuilder();
		
		builder.addHotel(10, "good");
		builder.addReservation("toto");
		builder.addTickets("jojo");
		
		
		VacationPlanner yourPlanner =builder.getVacationPlanner();
		System.out.println(yourPlanner);
		
	}
}
