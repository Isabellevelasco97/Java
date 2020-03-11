package assignment3;

public class Holiday {
	
	private String name;
	private int day;
	private String month;
	
	public Holiday() {
		name = "default name";
		day = 0;
		month = "Jan";
	}
	
	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	// Write a method inSameMonth, which compares two instances of the class
	// Holiday, and returns the Boolean value true if they have the same month, and
	// false if they do not.
	public boolean inSameMonth(Holiday other) {
		String monthOfOther = other.getMonth();
		boolean isSame = this.month.equals(monthOfOther);
		return isSame;
	}

	// Write a method avgDate which takes an array of base type Holiday as its
	// argument, and returns a double that is the average of the day variables in the
	// Holiday instances in the array. You may assume that the array is full (i.e.
	// does not have any null entries).
	public double avgDate(Holiday[] holidays) {
		double avg = 0;
		for (int i = 0; i < holidays.length; i++) {
			
		}
		
		return avg;
	}
}
