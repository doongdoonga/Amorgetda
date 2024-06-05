package org.Amorgetda.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageMusic {
	
	private List<Music> mList;
	
	public ManageMusic() {
		mList = new ArrayList<Music>();
	}
	
	public void registerMusic(Music music) {
		mList.add(music);
	}

	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}
	
	public void deleteMusic(int index) {
		mList.remove(index);
	}
	
	public void registerMusicAtFirst(Music music) {
		mList.add(music);
	}
	
	public List<Music> getAllMusics() {
		return mList;
	}
	
	public Music searchMusicByTitle(String name) {
		if(name != "" && name != null) {
			for(Music music : mList) {
				if(name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}
	
	public int searchIndexByName(String name) {
		if(name != "" && name != null) {
			int index = 0;
			for(Music music : mList) {
				if(name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	public void sortByTitleASC() {
		
		Collections.sort(mList);
//		//	collection - List, set, map 크기 - size()
//		int nums [] = {4, 3, 2, 1};
//		for(int i = 0; i <	mList.size()-1; i++) {
//			for(int j = 0; j < (mList.size()-1)-i; j++) {
//				//	버블정렬의 특징
//
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				
//				//	문제점 : 객체비교는 부등호로는 무리
//				//	비교해야 하는 것은 곡명(title)
//				//	title을 서로비교하여 늦은 순서인 경우 교체
//				//	문자열 비교는 equals()
//				
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
////					Music temp = mOne;
//					mList.set(j, mTwo);
////					mList.set(j+1, mOne);
//				}
//			}
//		}
//		for(int num : nums) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
	}

	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
	}

	public void sortBySingerASC() {
		
	}

	public void sortBySingerDESC() {
		
	}

}
