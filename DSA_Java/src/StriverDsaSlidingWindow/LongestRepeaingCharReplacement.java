package StriverDsaSlidingWindow;

public class LongestRepeaingCharReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRSolution("AABABBA" , 2);
	}
	static void LRSolution(String s , int k) {
		int hash[] = new int[26];
		int length = s.length();
		
		int maxLen = 0;
		for(int i=0;i<length;i++) {
			int changes = 0;
			int maxj = 0;
			for(int j=i;j<length;j++) {
				hash[s.charAt(j) - 'A']++;
				maxj = Math.max(hash[s.charAt(j) - 'A'] ,  maxj);
				changes = (j-i+1) - maxj;
				if(changes <= k) {
					maxLen = Math.max(maxLen , j-i+1);
				} else {
					break;
				}
			}
			for (int l = 0; l < 26; l++) {
                hash[l] = 0;
            }
		}
		System.out.println(maxLen);
	}

}
