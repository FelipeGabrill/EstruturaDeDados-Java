import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	public static void main(String[] args) {

		System.out.println(validatePassword("amerca1@"));
		System.out.println(validatePassword("amrca154682"));

		System.out.println(validatePassword1("amerca1@"));
		System.out.println(validatePassword1("amrca154682"));
	}

	public static boolean validatePassword(String str) {
		if (str.length() < 8) {
			return false;
		}

		boolean hasLetter = false;
		boolean hasSpecial = false;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				hasLetter = true;
			}

			if (str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '&') {
				hasSpecial = true;
			}

		}

		if (!hasLetter) {
			return false;
		}

		if (!hasSpecial) {
			return false;
		}

		return true;
	}

	public static boolean validatePassword1(String str) {
		String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@&#]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}

}
