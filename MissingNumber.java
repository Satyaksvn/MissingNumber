package sindhu;

public class MissingNumber {
	
	public static int findMissingNumber(int[] nums, int n) {
        // Calculate the expected sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the given array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Example array with numbers from 1 to 6 with 3 missing
        int n = 6; // Total number of elements should be from 1 to 6

        int missingNumber = findMissingNumber(nums, n);
        System.out.println("The missing number is: " + missingNumber);
    }

}
