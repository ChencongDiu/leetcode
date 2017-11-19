package HashTable;

import java.util.HashSet;

/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<> ();
		for (int i = 0; i < nums.length; i++) {
			if (!hs.add(nums[i])) {
				return true;
			}
		}
		
		return false;
    }
}
