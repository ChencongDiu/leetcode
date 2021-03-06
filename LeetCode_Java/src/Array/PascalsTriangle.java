package Array;

import java.util.ArrayList;
import java.util.List;

/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<> ();
		
		for (int i = 0; i < numRows; i++) {
			List<Integer> ele = new ArrayList<> ();
			for (int j = 0; j < i+1; j++) {
				if (j == 0 || j == i) {
					ele.add(1);
				} else {
					ele.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
				}
			}
			result.add(ele);
		}
		return result;
    }
}
