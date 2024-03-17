package dailyLeetcode;

import java.util.*;

public class Insert_Interval {

	public static void main(String[] args) {
		Solution_insert sc = new Solution_insert();
		int[] newInterval = new int[] {2,5};
		int[][] intervals = new int[][] {
			{1,3},
			{6,9}
//			{1,2},{3,5},{6,7},{8,10},{12,16}
		};
		sc.insert(intervals, newInterval);
		

	}

}


class Solution_insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // ArrayList<ArrayList> list2d = new int ArrayList<>();

//        int[][] answer = new int[intervals.length][];
    	ArrayList<int[]> answer = new ArrayList<>();

        int answer_row = 0;
        int answer_col = 0;
        int startoverlap = -1;
        int endoverlap = -1;
        
        for(int i=0;i<intervals.length;i++) {
        		boolean startno = true;
        		boolean endno = true;
//        		System.out.println(intervals[i][0] + " " + intervals[i][1] );
        		if(intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0]) {
        			startoverlap = i;
        			startno = false;
//        			System.out.println("when false newInterval 0 = " + newInterval[0]);
        		} 
        		if(intervals[i][0] <= newInterval[1] && intervals[i][1] >= newInterval[1]) {
        			endoverlap = i;
        			endno = false;
//        			System.out.println("when false newInterval 1 = " + newInterval[1]);
        		}
        		if(i==intervals.length) {
    				if(startoverlap==-1) {
    		        	startoverlap = endoverlap;
    		        }
    		        if(endoverlap == -1) {
    		        	endoverlap = startoverlap;
    		        }
    			}
        		
        		if(startno && endno) {
        			if(startoverlap== -1 || (startoverlap !=-1 && endoverlap!=-1) ) {
        				answer.add(new int[]{intervals[i][0], intervals[i][1]});
        			}      			
        		} else {
        			
        			
//        			System.out.println("i = " + i + ", startoverlap" + startoverlap);
        			System.out.println("i = " + i + ", endoverlap" + endoverlap);
//        			System.out.println("intervals[i][0] " + intervals[startoverlap][0]);
        			if(startoverlap!=-1 && endoverlap!=-1) {
        				int min = Math.min(intervals[startoverlap][0], newInterval[0]);
        				int max = Integer.MIN_VALUE;
        				for(int k=startoverlap;k<=endoverlap;k++) {
        					if(min == Integer.MAX_VALUE) {        						
        						
        					}
        		        	max = Math.max(intervals[i][1], newInterval[1]);
        		        }
        				answer.add(new int[]{min, max});
        			}
        		}
        		
        }

        int[][] result = new int[answer.size()][];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        System.out.println(Arrays.deepToString(result));

        return result;
    }
}