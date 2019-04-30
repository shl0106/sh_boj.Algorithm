package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

////백준 1026번문제
////접근방식:
////문제에서는 B배열은 건드리지 말라고 했지만 B배열을 정렬해서 푼다.
////A를 오름차순으로 정렬하고, B를 내림차순으로 정렬한 뒤 둘을 곱하면 최솟값이 나온다.
//간단한 코드
//public class 보물boj1026 {
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

//함수를 사용하여 풀이
public class 보물boj1026{
	static int[] A = new int[51]; //50보다 작거나 같은 자연수
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
	
	//오름차순 정렬
	public static void asort(int[] arr, int len) {
		for (int i = 0; i < len -1 ; i++) {
			for (int j = 0; j < len -1 - i; j++) {
				if (arr[j] > arr[j + 1]) { //'>' 제일큰게 뒤로감.
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	//내림차순 정렬
	public static void bsort(int[] arr, int len) {
		for (int i = 0; i < len -1 ; i++) {
			for (int j = 0; j < len -1 - i; j++) {
				if (arr[j] < arr[j + 1]) { //'>' 제일 작은게 뒤로감.
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}