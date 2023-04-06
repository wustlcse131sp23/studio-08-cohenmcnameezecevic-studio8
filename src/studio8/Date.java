package studio8;

import java.util.Objects;

public class Date {
	
	private String month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	
	/**
	 * 
	 * @param month represents integer month
	 * @param day represents integer day
	 * @param year represents integer year
	 * @param isHoliday whether holiday or not
	 */
    public Date(String month, int day, int year, boolean isHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
    
    

	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && Objects.equals(month, other.month)
				&& year == other.year;
	}



	@Override
	public String toString() {
		return "" + month + " " + day + ", " + year + ". Holiday? " + isHoliday;
	}


	public static void main(String[] args) {
		Date rand = new Date("February", 13, 1994, false);
		Date rand1 = new Date("February", 13, 1994, false);
		System.out.println(rand);
		System.out.print(rand.equals(rand1));
    }

}
