package tests;

/**
 * @author jennilj - jjarrell1
 * CIS175 - Fall 2023
 * Sept 11 2023
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.Song;
import model.SongLogic;

public class GenreTest {
    private SongLogic songLogic;
    
    @Before
    public void setUp() {
        songLogic = new SongLogic();
    }

    @Test
    public void testReviseGenreEDM() {
        Song song = new Song("Song1", "Artist1", "Atmospheric EDM");
        assertEquals("EDM", songLogic.reviseGenre(song));
    }

    @Test
    public void testReviseGenreClassical() {
        Song song = new Song("Song2", "Artist2", "Classical Guitar");
        assertEquals("Classical", songLogic.reviseGenre(song));
    }

    @Test
    public void testReviseGenreNoChange() {
        Song song = new Song("Song3", "Artist3", "Pop");
        assertNull(songLogic.reviseGenre(song)); // No revision expected.
    }
}