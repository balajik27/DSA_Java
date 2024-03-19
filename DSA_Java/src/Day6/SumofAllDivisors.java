package Day6;

public class SumofAllDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_divisors sd = new Solution_divisors();
		Solution_divisors.sumOfAllDivisors(5);
	}

}
class Solution_divisors {
    public static int sumOfAllDivisors(int n){
        // ArrayList<Integer> list = new ArrayList<>():
        int main_sum = 0;
        for(int num = 1;num<=n;num++){
            int sum = 0;
            
             for(int i=1;i*i<=num;i++){
                if(num%i==0){
                    sum+=i;
                    if((num/i)!=i){
                    sum+=(num/i);
                    }
                }
            }
             System.out.println("num = "+ num+ "sum = " + sum);
            main_sum += sum;
        }
        
      System.out.println(main_sum);
        return main_sum;
        // Write your code here.
    }
}