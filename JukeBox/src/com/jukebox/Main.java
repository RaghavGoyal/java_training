package com.jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	
	static ArrayList<Song> songArray = new ArrayList<>();
	
	public static void main(String[] args) {
		getSongs();
		
		for(Song song:songArray) {
			System.out.println(song);
		}
		
		System.out.println("============================After-Sorting===========================");
		
		Collections.sort(songArray, (Song obj1, Song obj2)->obj2.getRating()-obj1.getRating());
		for(Song song:songArray) {
			System.out.println(song);
		}
		
		
	}
	
	static void getSongs() {
		try {
			File file=new File("songs.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null) {
				addSongToList(line);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void addSongToList(String line) {
		String []token=line.split("/");
		Song obj = new Song(token[0],token[1],Integer.parseInt(token[2]),token[3]);
		songArray.add(obj);
		
	}
	
	

}
