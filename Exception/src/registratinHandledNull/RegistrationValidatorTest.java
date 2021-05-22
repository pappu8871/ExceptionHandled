package registratinHandledNull;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RegistrationValidatorTest {

private Object[] result;

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		RegistrationValidator validator = new RegistrationValidator();
		
		try {
	  boolean result = validator.registrationFirstName(null);
		} catch (RegiatrationValidatorException e) {
	  
	  Assert.assertEquals(null, result);
	}
}
}
