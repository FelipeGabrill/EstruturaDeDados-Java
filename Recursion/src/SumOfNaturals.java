
public class SumOfNaturals {

	public static void main(String[] args) {
        int result = sumNaturals(5);
        System.out.println("Result: " + result);
    }

    public static int sumNaturals(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNaturals(n - 1);
    }

}
