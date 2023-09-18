package tests;

/**
 * @author jennilj - jjarrell1
 * CIS175 - Fall 2023
 * Sept 12 2023
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.Song;
import model.SongLogic;

public class CalculateSecondsTest {
    private SongLogic songLogic;
    
    @Before
    public void setUp() {
        songLogic = new SongLogic();
    }

    @Test
    public void testCalculateMinutes() {
        // Test when the time is in seconds.
        Song song1 = new Song("Song1", "Artist1", "Genre1");
        song1.setTime(120.0); // 2 minutes in seconds
        assertEquals(2.0, songLogic.calculateMinutes(song1), 0.001);


        // Test when the time is 0 (should return 0 minutes).
        Song song3 = new Song("Song3", "Artist3", "Genre3");
        song3.setTime(0.0);
        assertEquals(0.0, songLogic.calculateMinutes(song3), 0.001);

    }
    
    @Test
    public void testCalculateSeconds() {
    	Song song = new Song("SongName", "ArtistName", "GenreName");
        song.setTime(2.5); // 2 minutes and 30 seconds
        assertEquals(150.0, songLogic.calculateSeconds(song), 0.001);

        song.setTime(0.0); // 0 minutes and 0 seconds
        assertEquals(0.0, songLogic.calculateSeconds(song), 0.001);
    }


}