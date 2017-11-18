package BinarySearch;

/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class TwoSumII_Inputarrayissorted {
	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
		for (int i = 0, j = numbers.length - 1; i < j; ) {
        	if (numbers[i] + numbers[j] < target) {
        		i++;
        		continue;
        	} else if (numbers[i] + numbers[j] > target) {
        		j--;
        		continue;
        	} else {
        		result[0] = ++i;
        		result[1] = ++j;
        		break;
        	}
        	
        }
        return result;
    }
}
