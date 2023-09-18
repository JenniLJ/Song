package model;

/**
 * @author jenni - jjarrell
 * CIS175 -Spring 2021
 * Feb 11, 2021
 */
public class SongLogic {
	
	public double calculateSeconds(Song song) {
		double seconds = 0;
		seconds = song.getTime() * 60; 
		return seconds;
	}
	
	public String reviseGenre(Song song) {
		String revisedGenre = null;
		if (song.getGenre() == "Atmospheric EDM" ) {
			revisedGenre = "EDM";
		}else if (song.getGenre() == "Classical Guitar" ) {
			revisedGenre = "Classical";
		}
		return revisedGenre;
	}

}
