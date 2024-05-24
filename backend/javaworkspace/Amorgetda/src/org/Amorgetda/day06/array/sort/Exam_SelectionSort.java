package org.Amorgetda.day06.array.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		//	선택정렬이란?
		//	배열을 전부 검색하여 최솟값을 고르고
		//	왼쪽부터 채워나가는 정렬
		//	특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
		//	배열의 n번 인덱스값을 n+1 ~ 마지막 인덱스까지 비교함
		//	{2, 5, 4, 1, 3}
		
		//	첫번째 결과 : {1, 5, 4, 2, 3}
		//	첫번째 결과 : {1, 2, 4, 5, 3}
		//	첫번째 결과 : {1, 2, 3, 5, 4}
		//	첫번째 결과 : {1, 2, 3, 4, 5}
		
		int [] arrs = {2, 5, 4, 1, 3};
		int min = 0;
		
		for(int i = 0; i < 4; i++) {
			//for(int j = i; j >= 0; j--){
			for(int j = i+1; j<5; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
					// 최소값이 정해졌을 때의
					// min을 arrs[min]으로 구하면 최솟값
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		for(int num : arrs) {
			System.out.print(num + " ");
		}
	}
}	
			
			
//				if(arrs[0] > arrs[1]) {
//					//니가 최솟값임
//				}
//				if(arrs[0] > arrs[2]) {
//					//니가 최솟값임
//				}
//				if(arrs[0] > arrs[3]) {
//					//니가 최솟값임
//				}
//				if(arrs[0] > arrs[4]) {
//					//니가 최솟값임
//				}
//				int temp = arrs[0];
//				arrs[0] = 최소값;
//				최소값의 자리 = temp;
//				
//				if(arrs[1] > arrs[2]) {
//					//니가 최솟값임
//				}
//				if(arrs[1] > arrs[3]) {
//					//니가 최솟값임
//				}
//				if(arrs[1] > arrs[4]) {
//					//니가 최솟값임
//				}
//				int temp = arrs[1];
//				arrs[1] = 최소값;
//				최소값의 자리 = temp;
//				
//				}
//				if(arrs[2] > arrs[3]) {
//					//니가 최솟값임
//				}
//				if(arrs[2] > arrs[4]) {
//					//니가 최솟값임
//				}
//				int temp = arrs[2];
//				arrs[2] = 최소값;
//				최소값의 자리 = temp;
//			}
//		}
//
//	}
//
//}