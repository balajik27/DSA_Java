package dailyLeetcode;
import java.util.*;
public class Find_All_Duplicates_in_an_Array {

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,7,8,2,3,1};
//		List<Integer> mylist = duplicate_num(nums);
//		List<Integer> mylist2 = duplicate_num_optimal(nums);
		
		Find_All_Duplicates_in_an_Array obj = new Find_All_Duplicates_in_an_Array();
		List<Integer> mylist3 = obj.duplicate_num_most_optimal(nums);
		
		
		for (int integer : mylist3) {
			System.out.println(integer);
		}
		
	}
	
	
	private List<Integer> res;
    public List<Integer> duplicate_num_most_optimal(int[] nums) {
        return new AbstractList<Integer>() {
            public Integer get(int index) {
                init();
                return res.get(index);
            }
            public int size() {
                init();
                return res.size();
            }
            private void init() {
                if(res != null) return;
                res = new ArrayList<>();
                int t;
                for(int i=0; i<nums.length; i++) {
                    t = Math.abs(nums[i]);
                    if(nums[t-1] < 0) {
                        res.add(t);
                    } else {
                        nums[t-1] *= -1;
                    }
                }
            }
        };
    }

	
	static List<Integer> duplicate_num_optimal(int[] nums) {
		int[] freq = new int[nums.length+1];
		ArrayList<Integer> mylist = new ArrayList<>();
		
		
		for (int integer : nums) {
			freq[integer]++;
		}
		for(int i=1;i<=nums.length;i++) {
			if(freq[i] == 2) {
				mylist.add(i);
			}
		}
		return mylist;
		
	}
	
	static List<Integer> duplicate_num(int[] nums) {
		
		ArrayList<Integer> mylist = new ArrayList<>();
		Map<Integer , Integer> hash = new HashMap<>();
		
		
		  for(int i=0;i<nums.length;i++){
             if(hash.containsKey(nums[i])){
                 if(hash.get(nums[i]) == 1){
                     mylist.add(nums[i]);
                 }
                 hash.put(nums[i] , hash.get(nums[i]) +1);
             } else {
                 hash.put(nums[i] , 1);
             }
         }
		  
//		  for(Map.Entry<Integer, Integer> entry : hash.entrySet()) {
//			  if(entry.getValue() == 2) {				  
//				  System.out.println("duplicates = " + entry.getKey());
//			  }
//		  }
		
		  return mylist;

	}
}
