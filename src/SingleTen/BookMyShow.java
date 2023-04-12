package SingleTen;

import java.util.Scanner;

class Theatre{
	int seats = 50;
	private static Theatre t = null;
	private Theatre() {		
	}
	public static Theatre getInstance() {
	if(t==null) t= new Theatre();
		return t;
	}
	public void reserseseats(int seatsNum) {
		if(seatsNum>seats) {
			System.out.println(seatsNum+"seats are not available	");
			System.out.println(seats+"seats are available");
			return;
		}
		System.out.println(seatsNum+"seats are available");
		seats = seats-seatsNum;
		System.out.println(seatsNum+"seats are booked");
		System.out.println(seats+"seats are available");
		System.out.println("Thank you for booking........!");
	}
}
class BookingApp{
	public void bookTickets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Tickets are available");
		int ticketsNum = sc.nextInt();
		Theatre theatre = Theatre.getInstance();
		theatre.reserseseats(ticketsNum);
	}
}
public class BookMyShow {

	public static void main(String[] args) {
		
		BookingApp cust1 = new BookingApp();
		cust1.bookTickets();
		
		BookingApp cust2 = new BookingApp();
		cust2.bookTickets();
		
		BookingApp cust3 = new BookingApp();
		cust3.bookTickets();

	}

}
