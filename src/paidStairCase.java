import java.util.Iterator;

public class paidStairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3,new int[]{0,3,2,4}));
	}
	
	public static int solution(int n,int[]cost) {
		//
		int []dp =new int[n+1];
		dp[0]=0;
		dp[1]=cost[1];
		for(int i=2;i<=n;i++) {
			dp[i]=Math.min(dp[i-1], dp[i-2])+cost[i];
		}
		return dp[n];
	}
	

}
