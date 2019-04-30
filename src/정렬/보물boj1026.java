package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

////���� 1026������
////���ٹ��:
////���������� B�迭�� �ǵ帮�� ����� ������ B�迭�� �����ؼ� Ǭ��.
////A�� ������������ �����ϰ�, B�� ������������ ������ �� ���� ���ϸ� �ּڰ��� ���´�.
//������ �ڵ�
//public class ����boj1026 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		int n = Integer.parseInt(br.readLine());
//		int[] A = new int[n];
//		int[] B = new int[n];
//		int sum = 0;
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++)
//			A[i] = Integer.parseInt(st.nextToken());
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++)
//			B[i] = Integer.parseInt(st.nextToken());
//		
//		Arrays.sort(A);
//		Arrays.sort(B);
//		
//		for(int i=0; i<n; i++) {
//			sum += A[i]*B[n-1-i];
//		}
//		
//		System.out.println(sum);
//	}
//}

//�Լ��� ����Ͽ� Ǯ��
public class ����boj1026{
	static int[] A = new int[51]; //50���� �۰ų� ���� �ڿ���
	static int[] B = new int[51];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) 
			B[i] = Integer.parseInt(st.nextToken());
		
		asort(A , n);
		bsort(B , n);
	
		for(int i=0; i<n; i++)
			sum += A[i] * B[i];
		
		System.out.println(sum);
	}
	
	//�������� ����
	public static void asort(int[] arr, int len) {
		for (int i = 0; i < len -1 ; i++) {
			for (int j = 0; j < len -1 - i; j++) {
				if (arr[j] > arr[j + 1]) { //'>' ����ū�� �ڷΰ�.
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	//�������� ����
	public static void bsort(int[] arr, int len) {
		for (int i = 0; i < len -1 ; i++) {
			for (int j = 0; j < len -1 - i; j++) {
				if (arr[j] < arr[j + 1]) { //'>' ���� ������ �ڷΰ�.
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}