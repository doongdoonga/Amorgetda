package org.Amorgetda.day12.collection.list;

class Member {
	
}

public class MemberList {
	Member [] members; // Member -> object 로 수정하면 모든 객체를 수용할 수 있다
	int size;
	
	public MemberList() {
		members = new Member[3];
		size = 0;
	}
	
	//	추가
	public void add(Member member) {
		members[size] = member;
		size++;
	}
	
	//	조회
	public Member get(int index) {
		return members[index];
		//	return members; //	Member []
		
	}
	
	//	크기
	public int size() {
		return size;
	}
	
	//	전체삭제
	public void clear() {
		members = new Member[5];
		size = 0;
	}
}

//	< 배열의 한계 >
//	배열은 1개의 데이터타입에 대해서
//	여러개의 데이터를 넣을 수 있음.
//	-> 1개의 데이터타입에 대해서만 넣을 수 있는 것이 
//	배열의 한계임...
