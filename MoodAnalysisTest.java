package Demo;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalysisTest {
	
	MoodAnalysis mood = new MoodAnalysis();
	
	/**
	 * created this test case to check the user is sad.
	 */
	
	 @Test
	    public void givenMessage_WhenHappy_ReturnHappy() {
	        String result = mood.analyseMood("User is Happy");
	        Assert.assertEquals("Entry Successful", result);
	    }

	    /**
		 * created this test case to check the user is sad.
		 */
	    @Test
	    public void givenMessage_WhenNotProper_Returnsad() {
	        String result = mood.analyseMood("User is Sad");
	        Assert.assertEquals("Entry Failed", result);
	    }

	}