package org.Amorgetda.day11.oop.member;

public class ManageMember {

	Member [] members;
	int index;
	
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	public void inserMember(Member member) {
		if(index < members.length) {
			members[index] = member;
			index++;
		}
	}
	
	public Member [] getAllMembers() {
		return members;
	}
	
	public Member searchOneByEmail(String email) {
		for(Member member : members) {
			if(member != null
					&& email.equals(member.getMemberEmail()) ) {
				return member;
			}
		}
		return null;
	}
	
	public void deleteAllMembers() {
		members = new Member[5];
		index = 0;
	}
}

