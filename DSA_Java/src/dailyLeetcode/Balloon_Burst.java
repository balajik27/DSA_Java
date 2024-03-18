package dailyLeetcode;

import java.util.Arrays;



public class Balloon_Burst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon_Burst_Solution bb = new Balloon_Burst_Solution();
		bb.findMinArrowShots(new int[][]{
//			{10,16},{2,8},{1,6},{7,12}
//			{1,2},{2,3},{3,4},{4,5}
//			{1,2},{3,4},{5,6},{7,8}
			{-1,1},{0,1},{2,3},{1,2}
		});
	}

}
class Balloon_Burst_Solution {
    public int findMinArrowShots(int[][] points) {

        int[] arr_points = new int[points.length];
//    	int max = 0;
       
        int row = points.length;
        for(int i=0;i<row;i++){
        	int temp_max=0;
            for(int k=0;k<row;k++){
            	if(k!=i) {
//            		System.out.println("k = " + k + ", i = "+ i);
//            		System.out.println("" + points[i][0]+ " " + points[i][1] + " , " + points[k][0] + " " + points[k][0] );
                    if((points[i][0] <= points[k][0] && points[i][1] >= points[k][0])){
                        arr_points[i]++;
//                        temp_max++;
                       
                    } else if((points[i][0] <= points[k][1] && points[i][1] >= points[k][1])) {
                    	arr_points[i]++;
                    }
            	}

            }
//            if(max < temp_max) {
//            	max = temp_max;
//            }
        }
//        System.out.println(points.length - max);

//        return points.length - max;
        System.out.println(Arrays.toString(arr_points));
        return 1;
        //gives wrong answer
        
    }
}