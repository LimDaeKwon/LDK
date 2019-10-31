package 프로젝트1;
public class 임대권_201602812_프로젝트1_코드 {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // 초기값
		System.out.println("초기행렬 : ");
		printMat(mat);
		System.out.println();
		System.out.println("1행에 -5 곱 후 2행에 더하기 : ");
		mult_Add(1,-5,2,mat);
		printMat(mat);
		System.out.println();
		System.out.println("1행에 -9 곱 후 3행에 더하기 : ");
		mult_Add(1,-9,3,mat);
		printMat(mat);
		System.out.println();
		System.out.println("2행에 -2 곱 후 3행에 더하기 : ");
		mult_Add(2,-2,3,mat);
		printMat(mat);
		System.out.println();
		System.out.println("2행에 -4 나누기");
		divide(2,-4,mat);
		printMat(mat);
		System.out.println();
		System.out.println("2행에 -2 곱 후  1행에 더하기");
		mult_Add(2,-2,1,mat);
		printMat(mat);	
	}
	// 중간중간 과정을 보기위한 printMatrix 구현.
	static void printMat(int[][] arr) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//기본행연산 
	static void exchange(int a,int b, int[][] arr) { // a행과 b열을 교환.
		for(int i=0;i<4;i++) {
			int t;
			t= arr[a-1][i];
			arr[a-1][i] = arr[b-1][i];
			arr[b-1][i] = t;
		}
	}
	static void multiply(int a,int b, int[][] arr) { // a행에 b 배 하기.
		for(int i=0;i<4;i++) {
			arr[a-1][i] *= b;
		}
	}
	static void divide(int a,int b, int[][] arr) { // int 사용으로 인한 나누기 구현(실수형으로 잡았더라면 구현필요x)
		for(int i=0;i<4;i++) { 
			arr[a-1][i] /= b;
		}
	}
	static void mult_Add(int a, int b, int c, int[][] arr) {// a행에 b배 해서 c행에 더하기.
		for(int i=0;i<4;i++) {
			arr[c-1][i] += b*arr[a-1][i];
		}
	}
}
