package ������Ʈ1;
public class �Ӵ��_201602812_������Ʈ1_�ڵ� {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // �ʱⰪ
		System.out.println("�ʱ���� : ");
		printMat(mat);
		System.out.println();
		System.out.println("1�࿡ -5 �� �� 2�࿡ ���ϱ� : ");
		mult_Add(1,-5,2,mat);
		printMat(mat);
		System.out.println();
		System.out.println("1�࿡ -9 �� �� 3�࿡ ���ϱ� : ");
		mult_Add(1,-9,3,mat);
		printMat(mat);
		System.out.println();
		System.out.println("2�࿡ -2 �� �� 3�࿡ ���ϱ� : ");
		mult_Add(2,-2,3,mat);
		printMat(mat);
		System.out.println();
		System.out.println("2�࿡ -4 ������");
		divide(2,-4,mat);
		printMat(mat);
		System.out.println();
		System.out.println("2�࿡ -2 �� ��  1�࿡ ���ϱ�");
		mult_Add(2,-2,1,mat);
		printMat(mat);	
	}
	// �߰��߰� ������ �������� printMatrix ����.
	static void printMat(int[][] arr) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//�⺻�࿬�� 
	static void exchange(int a,int b, int[][] arr) { // a��� b���� ��ȯ.
		for(int i=0;i<4;i++) {
			int t;
			t= arr[a-1][i];
			arr[a-1][i] = arr[b-1][i];
			arr[b-1][i] = t;
		}
	}
	static void multiply(int a,int b, int[][] arr) { // a�࿡ b �� �ϱ�.
		for(int i=0;i<4;i++) {
			arr[a-1][i] *= b;
		}
	}
	static void divide(int a,int b, int[][] arr) { // int ������� ���� ������ ����(�Ǽ������� ��Ҵ���� �����ʿ�x)
		for(int i=0;i<4;i++) { 
			arr[a-1][i] /= b;
		}
	}
	static void mult_Add(int a, int b, int c, int[][] arr) {// a�࿡ b�� �ؼ� c�࿡ ���ϱ�.
		for(int i=0;i<4;i++) {
			arr[c-1][i] += b*arr[a-1][i];
		}
	}
}
