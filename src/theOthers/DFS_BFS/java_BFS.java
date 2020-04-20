package theOthers.DFS_BFS;

//너비우선탐
public class java_BFS {
	static int n = 7;
	static int arr[][]= {{0,0,0,0,0,0,0},
			{0,0,1,1,0,0,0,0},
			{0,1,0,0,1,1,1,0},
			{0,1,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,0},
			{0,0,1,0,0,0,0,1},
			{0,0,1,0,0,0,0,0},
			{0,0,0,0,0,1,0,0}
	};
	public static void main(String[] args) {
		int f[] = new int[n+1];
		int q[] = new int[n];
		int head =0, tail =0;
		int i,j;
		int start = 1;
		
		f[start]=1;
		q[tail++] = start;
		
		 do{
			i = q[head++];
			for(j=1; j<=n; j++) {
				if(arr[i][j]==1&&f[j]==0) {
					q[tail++]=j;
					f[j]=1;
					System.out.println(i+"->"+j);
				}
			}
		}while(head<tail);
	}
}
