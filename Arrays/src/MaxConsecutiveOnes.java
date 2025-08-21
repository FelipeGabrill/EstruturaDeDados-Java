
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1,1,1,1}));  // 4
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));  // 2
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int countOnes = 0;
        
        for (int value : nums) {
            if (value == 1) {
                countOnes++;
            }

            if (value != 1 && countOnes > 0) {
                maxOnes = Math.max(maxOnes, countOnes);
                countOnes = 0;
            }
        }

        maxOnes = Math.max(maxOnes, countOnes);

        return maxOnes;
    }

}
