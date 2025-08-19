import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		System.out.println("\"" + longestCommonPrefix(new String[] { "flower", "flow", "flight" }) + "\"");
		System.out.println("\"" + longestCommonPrefix(new String[] { "dog","racecar","car" }) + "\"");
		
		System.out.println("\"" + longestCommonPrefix1(new String[] { "flower", "flow", "flight" }) + "\"");
		System.out.println("\"" + longestCommonPrefix1(new String[] { "dog","racecar","car" }) + "\"");
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
    
    public static String longestCommonPrefix1(String[] v) {

		StringBuilder result = new StringBuilder();

		Arrays.sort(v);
		String first = v[0];
		String last = v[v.length - 1];

		for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
			if (first.charAt(i) != last.charAt(i)) {
				return result.toString();
			}
			result.append(first.charAt(i));
		}

		return result.toString();
	}
}
