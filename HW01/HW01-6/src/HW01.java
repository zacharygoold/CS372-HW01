
public class HW01 {

	public static void main(String[] args) {
		Date day = new Date(1,4,2017);
		day.message();
		System.out.printf("\nMonth: "+day.getMonth());
		System.out.printf("\nDay: " + day.getDay());
        System.out.printf("\nYear: " + day.getYear());
        day.setDay(10);
        day.setMonth(10);
        day.setYear(2010);
        day.message();
	}
	
	
	
	
}
