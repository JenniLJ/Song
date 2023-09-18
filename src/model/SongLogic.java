package model;

/**
 * @author jennilj - jjarrell1
 * CIS175 - Fall 2023
 * Sept 12 2023
 */

public class SongLogic {
	
	public double calculateSeconds(Song song) {
		double seconds = 0;
		seconds = song.getTime() * 60; 
		return seconds;
	}
	
	public double calculateMinutes(Song song) {
	    double minutes = 0;
	    minutes = song.getTime() / 60; // Convert seconds to minutes
	    return minutes;
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
