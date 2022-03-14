package Demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
	/**
	 * The Test cases and check if the method passes the test case.
	 * the AssertTrue & False to check if the string passes the pattern.
	 * @author Dell
	 *
	 */
	public class UserRegTest {
		UserRegistration userRegTest = new UserRegistration();

		/**
		 * We have created this Test case to check if the first name is proper & if passes the regex pattern.
		 * The assertTrue will check if the result is true and the it will pass the test.
		 */
		@Test
		public void givenFirstName_IsProper_ReturnTrue() {
			boolean result = userRegTest.isValidFirstName("Nithya");
			assertTrue(result);
		
		}
	

		/**
		 * check if the last name is proper & if passes the regex pattern.
		 * The assertEquals will check if true or false and the output result.
		 */
		@Test
		public void givenLastName_IsProper_ReturnTrue() {
			boolean result = userRegTest.isValidLastName("Ram");
			Assert.assertEquals(true, result);
		}

		
		/**
		 * Test case to check valid email
		 */
		@Test
		public void givenEmailId_IsProper_ReturnTrue() {
			boolean result = userRegTest.isValidEmail("nithyaram@gmail.com");
			Assert.assertEquals(true, result);
		}

		
		/** 
		 * Test case to check valid mobile number
		 */
		@Test
		public void givenMobileNumber_IsProper_ReturnTrue() {
			boolean result = userRegTest.isValidPhoneNo("+91-9874561230");
			Assert.assertEquals(true, result);
		}

		
		/**
		 * Test case to check valid password
		 */
		@Test
		public void givenPassword_IsProper_ReturnTrue() {
			boolean result = userRegTest.isValidPassword("Nith1232@");
			Assert.assertEquals(true, result);
		}

	}