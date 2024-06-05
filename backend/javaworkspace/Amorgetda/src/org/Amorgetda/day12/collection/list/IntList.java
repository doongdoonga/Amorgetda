package org.Amorgetda.day12.collection.list;

public class IntList {
	
	int [] nums;
	int size;
	
	public IntList() {
		
		nums = new int[3];
		size = 0;
	}
	
	public void add(int num) {
		
		nums[size] = num;
		size++;
	}
	
	public int get(int num) {
	//	전체값을 가져올 때는 매개변수가 필요 없다.
	//	1개의 값을 가져올 때는 그 위치가 필요함으로 매개변수가 필요하다.
	//	return nums; //	<- 리턴 탑입 int []

	//	public inn get() {		v
		return nums[num];	// <- 리턴 타입 int, void랑 같이 쓸 수 없음
//		}
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		//	1. for문 돌면서 초기화
		//	2. 배열 자체 초기화
		
		nums = new int[3];
		size = 0;
	}

		
}
