package tests;

/**
 * @author jennilj - jjarrell1
 * CIS175 - Fall 2023
 * Sept 18 2023
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculateSecondsTest.class, GenreTest.class, TestSongLogic.class })
public class AllTests {

}
