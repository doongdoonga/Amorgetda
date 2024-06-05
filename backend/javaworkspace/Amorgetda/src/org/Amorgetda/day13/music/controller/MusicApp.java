package org.Amorgetda.day13.music.controller;

import java.util.List;

import org.Amorgetda.day13.collection.music.model.ManageMusic;
import org.Amorgetda.day13.collection.music.model.Music;
import org.Amorgetda.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {
		
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();
		
		while(true) {
			
			List<Music> mList = null;
			int choice = view. printMenu();
			int index = 0;
			String name = "";
			Music music = null;
			
			switch(choice) {
			case 1 :
				
				music = view.inputMusic();
				mng.registerMusic(music);
				break;
			
			case 2 : 
				
				music = view.inputMusic();
				mng.registerMusicAtFirst(music);
				break;
			
			case 3 : 
				
				mList = mng.getAllMusics();
				if(mList.size() > 0) {
					view.printMusicInfo(mList);
				}else {
					view.printMsg("정보가 존재하지 않습니다.");
				}
				break;
			
			case 4 :
				//	곡을 입력 받음
				//	mList에서 찾아서
				//	View를 이용하여 출력
				
				name = view.inputTitle("검색");
				music = mng.searchMusicByTitle(name);
				if(music != null) {
					view.printMusicInfo(music);
				}else {
					view.printMsg("검색 결과가 없습니다.");
				}
				break;
			case 5 :
				
				// 수정할 공명 입력
				name = view.inputTitle("수정");
				//	수정할 위치
				index = mng.searchIndexByName(name);
				//	수정할 정보
				music = mng.searchMusicByTitle(name);
				music = view.modifyMusic(music);
				mng.modifyMusic(index, music);
				break;
			
			case 6 : 
				
				name = view.inputTitle("삭제");
				index = mng.searchIndexByName(name);
				mng.deleteMusic(index);
				break;
			
			case 7 : 
				
				mng.sortByTitleASC();
				break;
			
			case 8 : 
				
				mng.sortByTitleDESC();
				break;
				
			case 9 : 
				
				mng.sortBySingerASC();
				break;
			
			case 10 : 
				
				mng.sortBySingerDESC();
				break;
			
			case 0 :
				
				view.printMsg("프로그램을 종료합니다.");
				break;
			
			default : 
				
				view.printMsg("메뉴를 잘못 선택하셧습니다.");
				break;
			
			}
		}
	}

}
