package dailyLeetcode;

public class march_12_Find_the_Pivot_Integer {

	public static void main(String[] args) {
		Solutions_2 ans = new Solutions_2();
		System.out.println(ans.pivotInteger(8));

	}

}
class Solutions_2 {
    public int pivotInteger(int n) {
        int firstSum = 1;
        int lastSum = n;

        int i = 1;
        int j = n;
        while(i!=j){
            
            if(firstSum < lastSum){
                firstSum = firstSum + i + 1;
                i++;
                System.out.println("First sum " + firstSum + " index i = " + i);
            }
            if(firstSum == lastSum && i<j){
                firstSum = firstSum + i + 1;
                lastSum = lastSum + j - 1;
                i++;
                j--;
                System.out.println("First sum " + firstSum + " index i = " + i);
                System.out.println("last sum equal both " + firstSum + " index j = " + j);
            }
            if(firstSum > lastSum && i<j){
                lastSum = lastSum + j - 1;
                j--;
                System.out.println("last sum " + lastSum + " index j = " + j);
            }
            if(i>j){
            	System.out.println("sum return -1");
                return -1;
            }
            if(firstSum == lastSum && i==j){
                return i;
            }

        }
        return -1;
    }
}