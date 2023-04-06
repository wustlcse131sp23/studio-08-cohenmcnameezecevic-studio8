package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	
	@Override
	public String toString() {
		return "Appointment on: " + date + ", at " + time + "";
	}
	public static void main(String[] args) {
		Appointment a1 = new Appointment(new Date("April", 6, 2023, false), new Time(13, 15, false));
		Appointment a2 = new Appointment(new Date("February", 14, 2023, false), new Time(6, 27, false));
		Appointment a3 = new Appointment(new Date("October", 24, 2023, false), new Time(8, 00, false));				
		Appointment a4 = new Appointment(new Date("October", 24, 2023, false), new Time(8, 00, false));
		Appointment a5 = new Appointment(new Date("November", 18, 2023, false), new Time(13, 15, false));
		
		LinkedList<Appointment> list = new LinkedList<Appointment>();
		list.add(a1); list.add(a2); list.add(a3); list.add(a4); list.add(a5);
		System.out.println(a1);
		System.out.println(a2);
		
	}
	
	
}
