
public class climblngStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(5));
		System.out.println(solution2(5));
		System.out.println(solution3(5));
		System.out.println(solution4(5,3));

	}
	public static int solution(int n) {
		if(n<0)return 0;
		if(n==0||n==1)return 1;
		if(n==2)return 2;
		return solution(n-1)+solution(n-2);
	}
	public static int solution2(int n) {
		int[]dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++)
			dp[i]=dp[i-1]+dp[i-2];
		
		return dp[n];
	}
	public static int solution3(int n) {
		int a=1,b=1,c=1;
		for(int i=2;i<=n;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
			
		}
		return c;
	}
	public static int solution4(int n,int k) {
		int[]dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(i-j<0)continue;
				dp[i]=dp[i]+dp[i-j];
			}
		}
		return dp[n];
	}
	public static int solution5(int n,int k) {
		int[]dp=new int[k];
		for(int i=2;i<=n;i++) {
			for(int j=1;j<k;j++) {
				if(i-j<0)continue;
				dp[i%k]+=dp[(i-j)%k];
			}
		}
		return dp[n%k];
	}
	
//red steps video 5 12:23
}
