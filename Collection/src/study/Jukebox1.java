package study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		new Jukebox1().go();
	}
	
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
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
		songList.add(tokens[0]);
	}

}
