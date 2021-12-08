
public class climblngStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(3));

	}
	public static int solution(int n) {
		if(n<0)return 0;
		if(n==0)return 1;
		
		return solution(n-1)+solution(n-2);
	}
	

}
