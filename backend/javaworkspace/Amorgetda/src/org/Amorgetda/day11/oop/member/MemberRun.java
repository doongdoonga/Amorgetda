package org.Amorgetda.day11.oop.member;

public class MemberRun {
	public static void main(String[] args) {
		
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		
		exit:
		while(true) {
			
			int choice = view.mainMenu();
			switch(choice) {
			case 1 :
				Member member = view.inputMember();
				mng.inserMember(member);
				break;
			case 2 : 
				String email = view.inputEmail();
				member = mng.searchOneByEmail(email);
				if(member != null)
					view.printOneByMember(member);
				else
					view.displayMessage("검색결과가 없습니다.");
				break;
			case 3 : 
				Member [] members = mng.getAllMembers();
				view.printAllMembers(members);
				break;
			case 4 : break;
			case 5 : 
				mng.deleteAllMembers();
				break;
			case 0 :
				view.displayMessage("프로그램을 종료합니다.");
				break exit;
			default :
				view.displayMessage("잘못입력하였습니다");
			}
		}
	}
}
			
			
			
			
			
