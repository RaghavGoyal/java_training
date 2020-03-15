package com.jukebox;

public class Song {
	
	private String name;
	private String artist;
	private int rating;
	private String language;
	
	public Song(String name, String artist, int rating, String language) {
		super();
		this.name = name;
		this.artist = artist;
		this.rating = rating;
		this.language = language;
	}
	
	

	@Override
	public String toString() {
		return "Song [name=" + name + ", artist=" + artist + ", rating=" + rating + ", language=" + language + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	

}
