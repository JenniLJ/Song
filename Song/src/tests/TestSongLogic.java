package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Song;
import model.SongLogic;

/**
 * @author jenni - jjarrell
 * CIS175 -Spring 2021
 * Feb 11, 2021
 */
public class TestSongLogic {

	/**
	 * @throws java.lang.Exception
	 */
	SongLogic soL = new SongLogic();
	Song song = new Song("Toi", "Worakls", "Atmospheric EDM");


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateSeconds() {
		song.setTime(1.5);
		double secondsTime = soL.calculateSeconds(song);
		assertEquals(90, secondsTime, 0.0); 
	}
	
	@Test
	public void testReviseGenre() {
		song.setGenre("Atmospheric EDM");
		String revisedGenre = soL.reviseGenre(song);
		assertEquals("EDM", revisedGenre); 
	}

}
