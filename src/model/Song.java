package model;

/**
 * @author jennilj - jjarrell1
 * CIS175 - Fall 2023
 * Sept 12 2023
 */
public class Song {
	private String songName;
	private String artist;
	private String genre;
	private double time;
	

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", artist=" + artist + ", genre=" + genre + "]";
	}
	public Song(String songName, String artist, String genre) {
		super();
		this.songName = songName;
		this.artist = artist;
		this.genre = genre;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	
}
