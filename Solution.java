import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		int heads=0;
		int tails=0;
		int diff = 0;
		int help = 0;
		for(int x: A){
			if(x == 0){
				heads++;

			}
			if(x == 1){
				tails++;
			}
		}
		if(tails > heads){
			diff = heads;
			while(diff != tails){
				diff++;
				tails--;
			}
			System.out.println(diff - heads);
			return diff - heads;
		}
		if(heads > tails){
			diff = tails;
			while(diff != heads){
			diff++;
			heads--;
			}
			System.out.println(diff-tails);
			return diff - tails;
		}
		return 0;
	}
	public static void main(String [] args){
	Solution s = new Solution();
	int [] a = {1, 0, 0, 1, 0, 0};
	s.solution(a);
	}
}
