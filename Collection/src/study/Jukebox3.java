package study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox3 {
	List<Song> songList = new ArrayList<Song>();
	
	//anonymous class
	class ArtistCompare implements Comparator<Song>{

		@Override
		public int compare(Song o1, Song o2) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		
	}
	public static void main(String[] args) {
		new Jukebox3().go();
	}

	public void go() {
		getSongs();
		System.out.println("Sort songList by Artist:");
		Collections.sort(songList);
		for (Song song : songList) {
			System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist());
		}
		System.out.println("---------------------------------------------");
		ArtistCompare artiscompare = new ArtistCompare();
//		Collections.sort(songList, artiscompare);
		Collections.sort(songList, new Comparator<Song>() {

			@Override
			public int compare(Song o1, Song o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		System.out.println("Sort songList by Title");
		for (Song song : songList) {
			System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist());
		}
		
		//HASHSET
		System.out.println("----------------------------------------------");
		System.out.println("HASHSET: ");
		Set<Song> songSet = new HashSet<Song>();
		
		songSet.addAll(songList);
		for (Song song : songSet) {
			System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist());
		}
		//TREESET
		System.out.println("-----------------------------------------------");
		System.out.println("TREESET: ");
		Set<Song> songTreeSet = new TreeSet<Song>(); // khai báo treeset Song
		songTreeSet.addAll(songList); // add songList vào treeset
		List<Song> ListSongTreeSet = new ArrayList<>(); 
		ListSongTreeSet.addAll(songTreeSet); // add treeset vào List
		Collections.sort(ListSongTreeSet, new Comparator<Song>() { // sort

			@Override
			public int compare(Song o1, Song o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		for (Song song : ListSongTreeSet) {
			System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist());
		}
	}


	void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader BR = new BufferedReader(new FileReader(file));

			String line = null;
			while ((line = BR.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void addSong(String LineToParse) {
		String[] tokens = LineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
