package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure; 

/**
 * @author jenni - jjarrell
 * CIS175 -Spring 2021
 * Feb 11, 2021
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
