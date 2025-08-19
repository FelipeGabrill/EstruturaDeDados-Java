
public class Date2 {
	public static void main(String[] args) {
		
		System.out.println(formatDate(21, 7, 2010));
		System.out.println(formatDate1(21, 7, 2010));

	}
	
	public static String formatDate(int day, int month, int year) {
		String[] date = {String.valueOf(day) , String.valueOf(month), String.valueOf(year)}; 
		for (int i = 0; i < date.length; i++) {
            if (date[i].length() == 1) {
                date[i] = "0" + date[i];
            }
        }
	    return String.join("/", date);
    }
	
	public static String formatDate1(int day, int month, int year) {
        String formatDay = String.format("%02d", day);
        String formatMonth = String.format("%02d", month);

        return formatDay + "/" + formatMonth + "/" + year;
    }
	
}
