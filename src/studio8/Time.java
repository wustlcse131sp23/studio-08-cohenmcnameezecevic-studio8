package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean isArmy;
	
	

	public Time(int hour, int minute, boolean isArmy) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.isArmy = isArmy;
	}
	



	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}




	@Override
	public String toString() {
		if (isArmy == true)
		{
			return hour + ":" + minute;
		}
		else 
		{
			if (hour > 12)
			{
				hour -= 12;
			}
			return hour + ":" + minute;
		}
	}




	public static void main(String[] args) {
		
		Time t1 = new Time(1, 02, true);
		Time t2 = new Time(13, 02, true);
		System.out.println(t1.equals(t2));
		Time t3 = new Time(7, 02, true);
		Time t4 = new Time(4, 01, false);
		System.out.println(t3.equals(t4));
		Time t5 = new Time(2, 02, true);
		Time t6 = new Time(12, 02, true);
		System.out.print(t1.equals(t2));
		
		HashSet<Time> times = new HashSet<Time>();
		times.add(t1);
		times.add(t2);
		times.add(t2);
		times.add(t2);
		times.add(t2);
		System.out.print(times); 
 
    	
    }

}