package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure; 

/**
 * @author jennilj - jjarrell1
 * CIS175 - 
 * Sept 11 2023
 */

public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestSongLogic.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}

}
