
public class Date1 {
	public static void main(String[] args) {
		
		DateData obj = extractDateData("21/07/2010");
		System.out.println("Dia: " + obj.day);
		System.out.println("Mês: " + obj.month);
		System.out.println("Ano: " + obj.year);
		
		DateData obj1 = extractDateData1("21/07/2010");
		System.out.println("Dia: " + obj1.day);
		System.out.println("Mês: " + obj1.month);
		System.out.println("Ano: " + obj1.year);
		
	}
	
	public static DateData extractDateData(String date) {

		String[] dtSplit = date.split("/");
		
		String day = dtSplit[0];
		String month = dtSplit[1];
		String year = dtSplit[2];

		return new DateData(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
	}
	
	public static DateData extractDateData1(String date) {

		String[] parts = date.split("/");

		int day = Integer.parseInt(parts[0]);
		int month = Integer.parseInt(parts[1]);
		int year = Integer.parseInt(parts[2]);

		return new DateData(day, month, year);
	}
}

class DateData {
	int day;
	int month;
	int year;

	public DateData(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}
